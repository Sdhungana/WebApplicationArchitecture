package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import edu.mum.domain.Category;
import edu.mum.domain.Product;
import edu.mum.service.CategoryService;
import edu.mum.service.ProductService;

@RequestMapping("/product")
@Controller
public class ProductController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductService productService;

	@GetMapping
	public String getProductForm(Model model ) {
		// TODO implementation...
		model.addAttribute("categories",categoryService.getAll());
		return "ProductForm";
	}

	@PostMapping
	public String saveProduct(Product product) {
		// TODO implementation...
		Category category = categoryService.getCategory(product.getCategory().getId());
		product.setCategory(category);
		productService.save(product);
		return "ProductDetails";
	}

	@GetMapping("/listproducts")
	public String listProducts(Model model) {
		// TODO implementation...
		model.addAttribute("products",productService.getAll());
		return "ListProducts";
	}

	@RequestMapping("/productfind")
	public String findProduct(Model model, @RequestParam(value = "id",required = false)Integer id) {
		// TODO
		if(id != null) {
			Product product = productService.getById(id);
			if(product != null) {
				model.addAttribute("product", product);
				return "SingleProduct";
			}
		}
		return "Find";

	}
}
