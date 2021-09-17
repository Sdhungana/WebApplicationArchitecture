import axios from "axios";
import "./FullPost.css";
const FullPost = ({ id = null, title, author, body, setFlag }) => {
  let post = <p>Please select a Post!</p>;
  if (id != null) {
    post = (
      <div className="FullPost">
        <h1>{title}</h1>
        <p>{author} </p>
        <p>{body}</p>
        <div className="Edit">
          <button className="Delete" onClick={() => deletePostHandler(id)}>
            Delete
          </button>
        </div>
      </div>
    );
  }

  const deletePostHandler = (id) => {
    axios
      .delete(`http://localhost:8088/api/posts/${id}`, {
        headers: {
          Authorization: `Bearer ${localStorage.getItem("Authorization")}`,
        },
      })
      .then((res) => {
        console.log(res);
        setFlag();
      })
      .catch((err) => console.log(err));
  };

  return post;
};

export default FullPost;
