import "./Post.css";
const Post = ({ id, title, body, author, clicked }) => {
  return (
    <article className="Post" onClick={clicked}>
      <b>ID:</b> {id} <br />
      <b>Title:</b> {title} <br />
      <b>Author:</b> {author} <br />
      {body}
    </article>
  );
};

export default Post;
