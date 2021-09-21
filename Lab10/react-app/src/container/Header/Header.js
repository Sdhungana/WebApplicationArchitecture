import axios from "axios";
import { useState, useEffect, useContext } from "react";
import { Link } from "react-router-dom";
import APIConfig from "../../store/APIConfig";
import "./Header.css";
const Header = () => {
  let auth = localStorage.getItem("Authorization");
  const [isAuthenticated, setIsAuthenticated] = useState(false);
  const [username, setUsername] = useState("");
  //const getUser = () => {};
  const { User_URL } = useContext(APIConfig);
  useEffect(() => {
    if (auth != null) {
      axios
        .get(`${User_URL}/username`, {
          headers: {
            Authorization: `Bearer ${auth}`,
          },
        })
        .then((res) => {
          setUsername(res.data);
        })
        .catch((err) => console.log(err));

      setIsAuthenticated(true);
    }
  }, [auth, User_URL]);

  let show = isAuthenticated ? (
    <>
      <Link to="#" style={{ color: "#fff", textDecoration: "none" }}>
        <span id="profile">Profile</span>
      </Link>

      <span id="welcome">Welcome , {username}</span>
    </>
  ) : (
    <Link to="/Login" style={{ color: "#fff", textDecoration: "none" }}>
      <span id="signin">Sign in</span>
    </Link>
  );

  return (
    <nav className="Header">
      <ul>
        <li>
          <Link to="/posts" style={{ color: "#fff", textDecoration: "none" }}>
            <span> Posts </span>
          </Link>
        </li>
        <li>
          <Link to="add-Post" style={{ color: "#fff", textDecoration: "none" }}>
            <span>New Posts</span>
          </Link>
        </li>
        <li>{show}</li>
      </ul>
    </nav>
  );
};
export default Header;
