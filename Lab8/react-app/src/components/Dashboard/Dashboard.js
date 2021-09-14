import Students from "../Student/Students";
const Dashboard = () => {
  const students = [
    { id: 1, name: "Sam" },
    { id: 2, name: "Mat" },
    { id: 3, name: "Jack" },
  ];
  return <Students students={students} />;
};

export default Dashboard;
