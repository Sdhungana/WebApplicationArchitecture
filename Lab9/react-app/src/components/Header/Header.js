import { Link } from "react-router-dom";
import "./Header.css";
const Header = () => {
  return (
    <nav className="Header">
      <ul>
        <li>
          <Link to="#" style={{ color: "#fff", textDecoration: "none" }}>
            {" "}
            Posts
          </Link>
        </li>
        <li>
          <Link to="#" style={{ color: "#fff", textDecoration: "none" }}>
            {" "}
            New Posts
          </Link>
        </li>
      </ul>
    </nav>
  );
};
export default Header;
