import "./Post.css";
const Post = ({ id, title, content, author }) => {
  const btn = <button>Follow</button>;
  return (
    <article className="Post">
      <b>{title}</b> <br />
      <b> {author}</b> <br />
      {content} <br />
      {btn}
    </article>
  );
};

export default Post;
