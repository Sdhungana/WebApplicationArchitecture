import { useState, useEffect, useContext } from "react";
import axios from "axios";
import APIConfig from "../../store/APIConfig";
import Post from "../../component/Post/Post";
const Posts = () => {
  const [posts, setPosts] = useState([]);
  const { Post_URL } = useContext(APIConfig);
  useEffect(() => {
    axios
      .get(Post_URL)
      .then((res) => {
        setPosts(res.data);
      })
      .catch((err) => console.log(err));
  }, [Post_URL]);
  const postList = posts.map((post) => <Post key={post.id} {...post} />);
  return postList;
};

export default Posts;
