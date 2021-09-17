import "./App.css";
import Blog from "./containers/Blog/Blog";
import { Switch, Route } from "react-router";
import Login from "./components/Login/Login";
import NewPost from "./components/NewPost/NewPost";

function App() {
  return (
    <div className="App">
      <Switch>
        <Route exact path="/" component={Login} />
        <Route exact path="/dashboard" component={Blog} />
        <Route exact path="/add-new" component={NewPost} />
      </Switch>
    </div>
  );
}

export default App;
