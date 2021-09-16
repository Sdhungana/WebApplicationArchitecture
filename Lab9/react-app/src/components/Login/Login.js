import axios from "axios";
import { useState } from "react";
import "./Login.css";

const Login = () => {
  const [formData, setFormData] = useState({ username: "", password: "" });
  const handleSubmit = (e) => {
    e.preventDefault();
    axios
      .post("http://localhost:8088/authenticate", formData)
      .then((res) => {
        localStorage.setItem("Authorization", res.data.jwt);
        window.location.href = "/dashboard";
      })
      .catch((err) => console.log(err));
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
