import Student from "./Student";

const Students = (props) => {
  const students = props.students;
  const studentList = students.map((s) => <Student key={s.id} {...s} />);
  return <div className="Students">{studentList}</div>;
};

export default Students;
