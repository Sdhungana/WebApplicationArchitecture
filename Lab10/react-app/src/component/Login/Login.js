import axios from "axios";
import { useState, useContext } from "react";
import APIConfig from "../../store/APIConfig";
import "./Login.css";

const Login = (props) => {
  const [formData, setFormData] = useState({ username: "", password: "" });
  const { Auth_URL } = useContext(APIConfig);
  const handleSubmit = (e) => {
    e.preventDefault();
    if (formData.username && formData.password) {
      axios
        .post(Auth_URL, formData)
        .then((res) => {
          localStorage.setItem("Authorization", res.data.jwt);
          props.history.push("/posts");
          window.location.reload("/posts");
        })
        .catch((err) => console.log(err));
    }
  };
  return (
    <div className="Login">
      Login
      <br />
      <form onSubmit={handleSubmit}>
        <div>
          <label>UserName: </label>{" "}
          <input
            type="text"
            name="username"
            onChange={(event) =>
              setFormData({ ...formData, username: event.target.value })
            }
          />
        </div>
        <div>
          <label>Password: </label>
          <input
            type="password"
            name="password"
            onChange={(event) =>
              setFormData({ ...formData, password: event.target.value })
            }
          />
        </div>
        <div>
          <input type="checkbox" name="checkbox" id="rememberme" />
          <label for="rememberme">Remember Me</label>
        </div>
        <div>
          <input type="submit" value="Login" />
        </div>
        <a href="/">Not registered yet?</a>
      </form>
    </div>
  );
};

export default Login;
