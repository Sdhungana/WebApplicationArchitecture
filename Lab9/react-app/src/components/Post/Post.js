import "./Post.css";
const Post = ({ id, title, content, author, clicked }) => {
  return (
    <article className="Post" onClick={clicked}>
      <b>ID:</b> {id} <br />
      <b>Title:</b> {title} <br />
      <b>Author:</b> {author} <br />
      {content}
    </article>
  );
};

export default Post;
