import { useRef } from "react";
import "./NewPost.css";
import axios from "axios";
// import { useHistory } from "react-router";
const NewPost = (props) => {
  //let history = useHistory();
  let formRef = useRef(null);

  const addPostHandler = () => {
    let form = formRef.current;
    const data = {
      title: form["title"].value,
      author: form["author"].value,
      content: form["content"].value,
    };
    axios
      .post("http://localhost:8088/api/posts", data)
      .then((res) => {
        form.reset();
        props.history.push("/posts");
      })
      .catch((err) => console.log(err));
  };
  return (
    <div className="NewPost">
      <h1>Add a Post</h1>
      <form ref={formRef}>
        <label>Title</label>
        <input type="text" name={"title"} />
        <label>Content</label>
        <textarea rows="4" name={"content"} />
        <label>Author</label>
        <select name={"author"}>
          <option value="Sam">Sam</option>
          <option value="Mat">Mat</option>
          <option value="Jack">Jack</option>
        </select>
      </form>
      <button onClick={addPostHandler}>Add Post</button>
    </div>
  );
};
export default NewPost;
