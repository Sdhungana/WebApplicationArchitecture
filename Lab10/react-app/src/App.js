import "./App.css";
import { Route, Switch, Redirect } from "react-router";
import Dashboard from "./container/Dashboard/Dashboard";
import APIConfig from "./store/APIConfig";
import NewPost from "./component/NewPost/NewPost";
import Login from "./component/Login/Login";
import Header from "./container/Header/Header";
function App() {
  const base = "http://localhost:8088";
  return (
    <div className="App">
      <APIConfig.Provider
        value={{
          Post_URL: `${base}/api/posts`,
          Auth_URL: `${base}/authenticate`,
          User_URL: `${base}/users`,
        }}
      >
        <Header />
        <Switch>
          <Route exact path="/posts" component={Dashboard} />
          <Route exact path="/add-post" component={NewPost} />
          <Route exact path="/login" component={Login} />
          <Redirect from="/" to="posts" />
        </Switch>
      </APIConfig.Provider>
    </div>
  );
}

export default App;
