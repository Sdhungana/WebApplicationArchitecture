import "./Posts.css";
import Post from "../../components/Post/Post";
const Posts = ({ posts, getID }) => {
  const postList = posts.map((post) => (
    <Post key={post.id} {...post} clicked={() => getID(post.id)} />
  ));
  return <div className="Posts">{postList}</div>;
};
export default Posts;
