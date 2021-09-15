import Students from "../Student/Students";
const Dashboard = () => {
  const students = [
    { id: 1, name: "Sam", major: "CS" },
    { id: 2, name: "Mat", major: "MBA" },
    { id: 3, name: "Jack", major: "Arts" },
  ];
  return (
    <div>
      <Students students={students} />
    </div>
  );
};

export default Dashboard;
