import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import axios from "axios";
import Posts from "../Posts/Posts";
import FullPost from "../../components/FullPost/FullPost";
const Blog = () => {
  const [posts, setPosts] = useState([]);
  const [selectID, setSelectID] = useState(null);
  const [flag, setFlag] = useState(new Date());
  useEffect(() => {
    axios
      .get("http://localhost:8088/api/posts", {
        headers: {
          Authorization: `Bearer ${localStorage.getItem("Authorization")}`,
        },
      })
      .then((res) => {
        setPosts(res.data);
      });
  }, [flag]);

  const getIDHandler = (id) => {
    setSelectID(id);
  };
  const logoutHandler = () => {
    localStorage.clear();
  };

  const fullPost = {
    id: selectID,
    title: { ...posts[selectID - 1] }.title,
    author: { ...posts[selectID - 1] }.author,
    body: { ...posts[selectID - 1] }.body,
  };
  return (
    <section>
      <button>
        {" "}
        <Link to="/" onClick={logoutHandler}>
          Logout
        </Link>{" "}
      </button>
      <button>
        <Link to="/add-new">Add New Post</Link>{" "}
      </button>
      <Posts posts={posts} getID={getIDHandler} />
      <FullPost {...fullPost} setFlag={setFlag} />
    </section>
  );
};

export default Blog;
