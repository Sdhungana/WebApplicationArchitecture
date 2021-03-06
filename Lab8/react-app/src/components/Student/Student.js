import { useState, useRef } from "react";
import "./Student.css";
const Student = ({ id, name, major }) => {
  const [showBtn, setShowBtn] = useState(false);
  const [myName, setmyName] = useState(name);
  const inputElem = useRef(null);

  const showBtnHandler = (e) => {
    if (e.target === e.currentTarget) {
      setShowBtn(!showBtn);
    }
  };
  const changeNameHandler = (val) => {
    setmyName(val);
    inputElem.current.value = "";
  };

  return (
    <div className="Student" onClick={showBtnHandler}>
      ID: {id} <br />
      Name: {myName} <br />
      Major: {major} <br />
      <br />
      {showBtn ? (
        <div>
          <button type="button">Edit </button>
          <button type="button">Delete </button>
        </div>
      ) : null}
      <input type="text" ref={inputElem} />
      <button
        type="button"
        onClick={() => changeNameHandler(inputElem.current.value)}
      >
        Change Name
      </button>
    </div>
  );
};
export default Student;
