const express = require("express");
const cors = require("cors");
const bodyParser = require("body-parser");
const app = express();
const port = 3001;

let users = [
  {
    user_id: 1,
    username: "John",
    email: "admin@example.com",
    password: "adminpassword",
    role: "ADMIN",
    managerid: 2,
    status: "ACTIVE",
    specialization: "Backend",
  },
  {
    user_id: 2,
    username: "Alex",
    email: "manager@example.com",
    password: "managerpassword",
    role: "PROJECT_MANAGER",
    managerid: 1,
    status: "ACTIVE",
    specialization: "Backend",
  },
  {
    user_id: 3,
    username: "Alice",
    email: "member@example.com",
    password: "memberpassword",
    role: "TEAM_MEMBER",
    managerid: 2,
    status: "INACTIVE",
    specialization: "Frontend",
  },
  {
    user_id: 4,
    username: "Bob",
    email: "bob@example.com",
    password: "bobbypassword",
    role: "TEAM_MEMBER",
    managerid: 2,
    status: "ACTIVE",
    specialization: "Backend",
  },
  {
    user_id: 5,
    username: "Charlie",
    email: "charlie@example.com",
    password: "charliepassword",
    role: "TEAM_MEMBER",
    managerid: 0,
    status: "ACTIVE",
    specialization: "Full Stack",
  },
  {
    user_id: 6,
    username: "Diana",
    email: "diana@example.com",
    password: "dianapassword",
    role: "TEAM_MEMBER",
    managerid: 0,
    status: "ACTIVE",
    specialization: "DevOps",
  },
];

let clients = [
  {
    client_id: 1,
    name: "John Doe",
    companyName: "Tech Solutions",
    email: "john.doe@techsolutions.com",
    phone: "+912345678900",
  },
];

// Sample data for projects
let projects = [
  {
    project_id: 1,
    clientid: 1,
    name: "Project Alpha",
    desc: "Project Alpha aims to revolutionize the client’s existing system by integrating advanced technologies and optimizing workflows. The project encompasses multiple phases, including initial assessment, design, development, testing, and deployment. Our goal is to enhance user experience, improve performance, and ensure scalability. Key features include a revamped user interface, enhanced security measures, and seamless integration with third-party services.",
    managerid: 1,
  },
  {
    project_id: 2,
    clientid: 1,
    name: "Project Beta",
    desc: "Project Beta is focused on developing a new software platform to support the client’s growing needs in the digital marketplace. The project will involve thorough market research, user requirement analysis, agile development, and continuous integration and deployment. Key objectives include creating a robust backend infrastructure, implementing machine learning algorithms for predictive analytics, and ensuring high availability and fault tolerance.",
    managerid: 2,
  },
];

let tasks = [
  {
    task_id: 1,
    task_name: "Create Registration Page",
    project_id: 1,
    description:
      "Design the project architecture. This task involves setting up the initial structure of the project including selecting the appropriate frameworks and libraries, configuring the development environment, and establishing coding standards and best practices. Additionally, it includes creating initial database schemas and ensuring that the project is scalable and maintainable in the long run.",
    assigned_to: 3,
    status: "IN PROGRESS",
  },
  {
    task_id: 2,
    task_name: "Login Page",
    project_id: 1,
    description:
      "Implement backend API. This task requires the development of secure and efficient API endpoints to handle user authentication and authorization. It includes setting up JWT (JSON Web Tokens) for session management, implementing rate limiting to prevent abuse, and ensuring compliance with relevant security standards such as OAuth2. Furthermore, extensive testing and documentation are necessary to guarantee the reliability and robustness of the API.",
    assigned_to: 2,
    status: "IN REVIEW",
  },
  {
    task_id: 3,
    task_name: "Dashboard",
    project_id: 1,
    description:
      "Create the main dashboard UI. This involves designing and developing a user-friendly dashboard that provides an overview of key metrics and data. The task includes wireframing, prototyping, and implementing the dashboard using a modern frontend framework. Attention to detail is required to ensure a seamless user experience, responsive design, and accessibility compliance. Integration with backend services to fetch and display real-time data is also a critical aspect of this task.",
    assigned_to: 4,
    status: "IN PROGRESS",
  },
  {
    task_id: 4,
    task_name: "Profile Page",
    project_id: 1,
    description:
      "Develop the user profile page. This task entails creating a comprehensive profile page where users can view and edit their personal information, upload a profile picture, and manage their account settings. It requires implementing form validation, handling file uploads, and ensuring data privacy and security. The profile page should be intuitive and visually appealing, offering users an effortless way to manage their information.",
    assigned_to: 5,
    status: "TO DO",
  },
  {
    task_id: 5,
    task_name: "Settings Page",
    project_id: 2,
    description:
      "Implement settings and preferences. This task includes developing a settings page where users can customize their experience. Features might include notification preferences, theme selection (light/dark mode), and other user-specific configurations. The task requires a good understanding of user experience principles to ensure that the settings are easy to find and use. Additionally, it involves backend support to save and retrieve user preferences.",
    assigned_to: 6,
    status: "IN PROGRESS",
  },
  {
    task_id: 6,
    task_name: "Logout Functionality",
    project_id: 2,
    description:
      "Develop logout functionality. This involves implementing a secure logout mechanism that ensures users are properly signed out and their session is terminated. It includes invalidating tokens, clearing cookies or local storage, and redirecting the user to the login page. Attention to security is crucial to prevent unauthorized access and ensure that no user data is exposed after logout. Additionally, user feedback mechanisms should be in place to confirm the successful logout.",
    assigned_to: 6,
    status: "TO DO",
  },
  {
    task_id: 7,
    task_name: "Analytics",
    project_id: 2,
    description: "Integrate analytics tracking",
    assigned_to: 4,
    status: "IN REVIEW",
  },
  {
    task_id: 8,
    task_name: "Payment Integration",
    project_id: 2,
    description: "Integrate payment gateway",
    assigned_to: 5,
    status: "TESTING",
  },
  {
    task_id: 9,
    task_name: "Create Chat Feature",
    project_id: 2,
    description: "Develop real-time chat functionality",
    assigned_to: 3,
    status: "BLOCKED",
  },
  {
    task_id: 6,
    task_name: "Notifications",
    project_id: 2,
    description: "Integrate notification system",
    assigned_to: 4,
    status: "TO DO",
  },

  {
    task_id: 11,
    task_name: "Create FAQ Page",
    project_id: 2,
    description:
      "Develop a comprehensive FAQ page. This involves gathering and organizing common questions and answers about the application. The task includes designing a user-friendly layout that categorizes questions for easy navigation. Implement search functionality to help users find relevant information quickly. Ensure that the page is responsive and accessible, providing a seamless experience across all devices.",
    assigned_to: 3,
    status: "TO DO",
  },
  {
    task_id: 12,
    task_name: "Create Help Center",
    project_id: 2,
    description:
      "Build an extensive help center. This task requires creating a dedicated section where users can find detailed guides, tutorials, and troubleshooting tips. The help center should include a well-structured knowledge base, video tutorials, and a contact form for additional support. Implement analytics to track user interactions and identify the most common issues, allowing for continuous improvement.",
    assigned_to: 3,
    status: "TO DO",
  },
  {
    task_id: 13,
    task_name: "Create Feedback Form",
    project_id: 2,
    description:
      "Develop a feedback form for users to submit their suggestions and report issues. This task involves designing an intuitive form with various input fields to capture detailed feedback. Ensure that the form is easy to access and use, and integrate it with the backend to store and manage the feedback data. Implement a notification system to alert the support team of new submissions.",
    assigned_to: 3,
    status: "TO DO",
  },
  {
    task_id: 14,
    task_name: "Create Terms and Conditions Page",
    project_id: 2,
    description:
      "Draft and develop the terms and conditions page. This involves writing clear and concise legal text outlining the rules and regulations for using the application. The task includes ensuring that the terms are comprehensive and compliant with relevant laws and regulations. Design the page to be easily readable and accessible, with links to related documents such as the privacy policy.",
    assigned_to: 3,
    status: "TO DO",
  },
  {
    task_id: 15,
    task_name: "Create About Us Page",
    project_id: 2,
    description:
      "Design and develop an engaging About Us page. This task involves creating content that tells the story of the company, its mission, values, and team members. Include high-quality images, biographies of key team members, and a timeline of significant milestones. The page should be visually appealing and reflect the brand's identity. Ensure that the layout is responsive and optimized for all devices.",
    assigned_to: 3,
    status: "TO DO",
  },
];

let teams = [
  {
    team_id: 1,
    team_name: "Backend Team",
    project_id: 1,
  },
];
let team_member = [];

app.use(cors());
app.use(bodyParser.json());

// Middleware to validate numeric fields
const validateNumericFields = (req, res, next) => {
  const { clientid, managerid } = req.body;
  if (
    (clientid && isNaN(Number(clientid))) ||
    (managerid && isNaN(Number(managerid)))
  ) {
    return res.status(400).send({
      message: "clientid and managerid must be numeric.",
    });
  }
  next();
};
app.get("/admin/teams", (req, res) => {
  res.status(200).json(teams);
});

app.put("/admin/users/:user_id", (req, res) => {
  const { user_id } = req.params;
  const { managerid } = req.body;
  const userIndex = users.findIndex(
    (user) => user.user_id === parseInt(user_id)
  );

  if (userIndex !== -1) {
    users[userIndex].managerid = managerid;
    res.json(users[userIndex]);
  } else {
    res.status(404).json({ error: "User not found" });
  }
});

// User routes
app.get("/admin/users", (req, res) => {
  res.status(200).json(users);
});

app.get("/admin/users/:id", (req, res) => {
  const userId = parseInt(req.params.id, 10);
  const user = users.find((user) => user.user_id === userId);
  if (user) {
    res.status(200).json(user);
  } else {
    res.status(404).send({ message: "User not found!" });
  }
});
app.post("/admin/teamMember", (req, res) => {
  const teamMemberData = req.body;
  console.log("Team member data received:", teamMemberData);

  // Add to the in-memory store
  team_member.push({
    ...teamMemberData,
    team_id: parseInt(teamMemberData.team_id, 10),
    user_id: parseInt(teamMemberData.user_id, 10),
  });

  // Respond with success message
  res.status(200).send({ message: "Team member added successfully!" });
});
app.get("/admin/teamMembers", (req, res) => {
  console.log("Fetching team members...");
  res.status(200).json(team_member);
});
app.delete("/admin/teamMember", (req, res) => {
  const { team_id, user_id } = req.body;
  console.log("Remove team member request received:", { team_id, user_id });

  const initialLength = team_member.length;

  // Remove the team member
  team_member = team_member.filter(
    (member) =>
      !(
        member.team_id === parseInt(team_id, 10) &&
        member.user_id === parseInt(user_id, 10)
      )
  );

  if (team_member.length < initialLength) {
    res.status(200).send({ message: "Team member removed successfully!" });
  } else {
    res.status(404).send({ message: "Team member not found!" });
  }
});

app.post("/admin/registration", (req, res) => {
  const userData = req.body;
  console.log("User data received:", userData);

  users.push({
    ...userData,
    user_id: parseInt(userData.user_id, 10),
    managerid: parseInt(userData.managerid, 10),
  });

  res.status(200).send({ message: "User created successfully!" });
});
app.put("/admin/users/:user_id", (req, res) => {
  const userId = parseInt(req.params.user_id, 10);
  const { manager_id } = req.body;

  // Find and update the user's manager_id
  let user = users.find((user) => user.user_id === userId);
  if (user) {
    user.managerid = manager_id;
    res.status(200).send({ message: "User manager_id updated successfully!" });
  } else {
    res.status(404).send({ message: "User not found!" });
  }
});

app.put("/admin/updateUser/:userid", (req, res) => {
  const userId = parseInt(req.params.userid, 10);
  const updatedUserData = req.body;
  console.log("Update request for user ID:", userId);
  console.log("Updated user data:", updatedUserData);

  const userIndex = users.findIndex((user) => user.user_id === userId);

  if (userIndex === -1) {
    res.status(404).send({ message: "User not found!" });
  } else {
    users[userIndex] = {
      ...users[userIndex],
      ...updatedUserData,
      user_id: userId,
    };
    res.status(200).send({ message: "User updated successfully!" });
  }
});

app.put("/admin/deactivateUser/:userid", (req, res) => {
  const userId = parseInt(req.params.userid, 10);
  console.log("Deactivate request for user ID:", userId);

  const userIndex = users.findIndex((user) => user.user_id === userId);

  if (userIndex === -1) {
    res.status(404).send({ message: "User not found!" });
  } else {
    users[userIndex].status = "INACTIVE";
    res.status(200).send({ message: "User deactivated successfully!" });
  }
});

app.put("/admin/assignRole/:userid", (req, res) => {
  const userId = parseInt(req.params.userid, 10);
  const { role } = req.body;

  const userIndex = users.findIndex((user) => user.user_id === userId);

  if (userIndex === -1) {
    res.status(404).send({ message: "User not found!" });
  } else {
    users[userIndex].role = role;
    res.status(200).send({ message: "Role assigned successfully!" });
  }
});

// Client routes
app.get("/admin/clients", (req, res) => {
  res.status(200).json(clients);
});

app.post("/admin/createClient", (req, res) => {
  const clientData = req.body;
  console.log("Client data received:", clientData);

  clients.push({
    ...clientData,
    client_id: parseInt(clientData.client_id, 10),
  });

  res.status(200).send({ message: "Client created successfully!" });
});

// Project routes
app.get("/admin/projects", (req, res) => {
  res.status(200).json(projects);
});

app.post("/admin/createProject", validateNumericFields, (req, res) => {
  const projectData = req.body;
  console.log("Project data received:", projectData);

  projects.push({
    ...projectData,
    project_id: projects.length
      ? projects[projects.length - 1].project_id + 1
      : 1,
    clientid: Number(projectData.clientid),
    managerid: Number(projectData.managerid),
  });

  res.status(200).send({ message: "Project created successfully!" });
});

app.put(
  "/admin/updateProject/:projectid",
  validateNumericFields,
  (req, res) => {
    const projectId = parseInt(req.params.projectid, 10);
    const updatedProjectData = req.body;
    console.log("Update request for project ID:", projectId);
    console.log("Updated project data:", updatedProjectData);

    const projectIndex = projects.findIndex(
      (project) => project.project_id === projectId
    );

    if (projectIndex === -1) {
      res.status(404).send({ message: "Project not found!" });
    } else {
      projects[projectIndex] = {
        ...projects[projectIndex],
        ...updatedProjectData,
        project_id: projectId,
        clientid: Number(updatedProjectData.clientid),
        managerid: Number(updatedProjectData.managerid),
      };
      res.status(200).send({ message: "Project updated successfully!" });
    }
  }
);

// Tasks
app.get("/admin/tasks", (req, res) => {
  res.status(200).json(tasks);
});

// Create a new task
app.post("/admin/createTask", (req, res) => {
  const taskData = req.body;
  console.log("Task data received:", taskData);

  tasks.push({
    ...taskData,
    task_id: tasks.length ? tasks[tasks.length - 1].task_id + 1 : 1,
  });

  res.status(200).send({ message: "Task created successfully!" });
});

// Update a task
app.put("/admin/updateTask/:taskid", (req, res) => {
  const taskId = parseInt(req.params.taskid, 10);
  const updatedTaskData = req.body;
  console.log("Update request for task ID:", taskId);
  console.log("Updated task data:", updatedTaskData);

  const taskIndex = tasks.findIndex((task) => task.task_id === taskId);

  if (taskIndex === -1) {
    res.status(404).send({ message: "Task not found!" });
  } else {
    tasks[taskIndex] = {
      ...tasks[taskIndex],
      ...updatedTaskData,
      task_id: taskId,
    };
    res.status(200).send({ message: "Task updated successfully!" });
  }
});

app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});

app.get("/admin/tasks/:userid", (req, res) => {
  const userId = parseInt(req.params.userid, 10);
  const userTasks = tasks.filter((task) => task.assigned_to === userId);
  res.status(200).json(userTasks);
});

app.put("/admin/tasks/:task_id", (req, res) => {
  const { task_id } = req.params;
  const updatedTask = req.body;

  const taskIndex = tasks.findIndex(
    (task) => task.task_id === parseInt(task_id)
  );
  if (taskIndex !== -1) {
    tasks[taskIndex] = { ...tasks[taskIndex], ...updatedTask };
    res.status(200).json({ message: "Task updated successfully" });
  } else {
    res.status(404).json({ message: "Task not found" });
  }
});

app.put("/admin/updateTaskStatus/:taskid", (req, res) => {
  const taskId = parseInt(req.params.taskid, 10);
  const { status } = req.body;
  const taskIndex = tasks.findIndex((task) => task.task_id === taskId);
  if (taskIndex === -1) {
    res.status(404).send({ message: "Task not found!" });
  } else {
    tasks[taskIndex].status = status;
    res.status(200).send({ message: "Task status updated successfully!" });
  }
});

app.get("/admin/tasks/:taskid", (req, res) => {
  const taskId = parseInt(req.params.taskid, 10);
  const task = tasks.find((task) => task.task_id === taskId);
  if (task) {
    res.status(200).json(task);
  } else {
    res.status(404).send({ message: "Task not found!" });
  }
});

app.get("/admin/projects/:projectid", (req, res) => {
  const projectId = parseInt(req.params.projectid, 10);
  const project = projects.find((project) => project.project_id === projectId);
  if (project) {
    res.status(200).json(project);
  } else {
    res.status(404).send({ message: "Project not found!" });
  }
});

app.get("/admin/clients/:clientid", (req, res) => {
  const clientId = parseInt(req.params.clientid, 10);
  const client = clients.find((client) => client.client_id === clientId);
  if (client) {
    res.status(200).json(client);
  } else {
    res.status(404).send({ message: "Client not found!" });
  }
});
// API to get task details by task ID
app.get("/admin/task/:taskid", (req, res) => {
  const taskId = parseInt(req.params.taskid, 10);
  const task = tasks.find((task) => task.task_id === taskId);
  if (task) {
    res.status(200).json(task);
  } else {
    res.status(404).send({ message: "Task not found!" });
  }
});

// API to get project details by project ID
app.get("/admin/project/:projectid", (req, res) => {
  const projectId = parseInt(req.params.projectid, 10);
  const project = projects.find((project) => project.project_id === projectId);
  if (project) {
    res.status(200).json(project);
  } else {
    res.status(404).send({ message: "Project not found!" });
  }
});

// API to get client details by client ID
app.get("/admin/client/:clientid", (req, res) => {
  const clientId = parseInt(req.params.clientid, 10);
  const client = clients.find((client) => client.client_id === clientId);
  if (client) {
    res.status(200).json(client);
  } else {
    res.status(404).send({ message: "Client not found!" });
  }
});

app.put("/admin/resetPassword", (req, res) => {
  const { email, newPassword } = req.body;

  if (!email || !newPassword) {
    return res
      .status(400)
      .send({ message: "Email and new password are required." });
  }

  const userIndex = users.findIndex((user) => user.email === email);

  if (userIndex === -1) {
    return res.status(404).send({ message: "User not found!" });
  }

  users[userIndex].password = newPassword;

  res.status(200).send({ message: "Password updated successfully!" });
});
app.get("/admin/users", (req, res) => {
  res.status(200).json(users);
});
app.get("/admin/projects", (req, res) => {
  res.status(200).json(projects);
});
app.post("/admin/addTeamMemberToProject", (req, res) => {
  const { projectId, userId } = req.body;

  // Find the project
  const project = projects.find((project) => project.project_id === projectId);
  if (!project) {
    return res.status(404).send({ message: "Project not found!" });
  }

  // Find the user
  const user = users.find((user) => user.user_id === userId);
  if (!user) {
    return res.status(404).send({ message: "User not found!" });
  }

  // Assuming each project has a `teamMembers` array to store team member IDs
  if (!project.teamMembers) {
    project.teamMembers = [];
  }

  // Check if the user is already a team member of the project
  if (project.teamMembers.includes(userId)) {
    return res
      .status(400)
      .send({ message: "User is already a team member of this project!" });
  }

  // Add the user to the project's team members
  project.teamMembers.push(userId);

  res
    .status(200)
    .send({ message: "Team member added to the project successfully!" });
});

app.post("/admin/removeTeamMember", (req, res) => {
  const { projectId, userId } = req.body;

  // Find the project
  const project = projects.find((project) => project.project_id === projectId);
  if (!project) {
    return res.status(404).send({ message: "Project not found!" });
  }

  // Check if the user is a team member of the project
  const memberIndex = project.teamMembers.indexOf(userId);
  if (memberIndex === -1) {
    return res
      .status(404)
      .send({ message: "User is not a team member of this project!" });
  }

  // Remove the user from the project's team members
  project.teamMembers.splice(memberIndex, 1);

  // Optionally, remove the user from the users array
  const userIndex = users.findIndex((user) => user.user_id === userId);
  if (userIndex !== -1) {
    users.splice(userIndex, 1);
  }

  res
    .status(200)
    .send({ message: "Team member removed from the project successfully!" });
});

app.get("/admin/teamMembers", (req, res) => {
  const teamMembers = users.filter((user) => user.role === "TEAM_MEMBER");
  res.status(200).json(teamMembers);
});
//new api to assign task
app.post("/admin/assignTask", (req, res) => {
  const { taskName, assignedTo, taskDescription, taskDeadline } = req.body;

  // Find the user
  const user = users.find((user) => user.user_id === assignedTo);
  if (!user) {
    return res.status(404).send({ message: "User not found!" });
  }

  // Check if the user is a team member
  if (user.role !== "TEAM_MEMBER") {
    return res.status(400).send({ message: "User is not a team member!" });
  }

  // Create the new task
  const newTask = {
    task_id: tasks.length ? tasks[tasks.length - 1].task_id + 1 : 1,
    task_name: taskName,
    project_id: 1,
    description: taskDescription,
    assigned_to: assignedTo,
    status: "NOT_STARTED",
    deadline: taskDeadline,
  };

  tasks.push(newTask);

  res.status(200).send({ message: "Task assigned successfully!" });
});

app.put("/admin/updateTaskStatus/:taskid", (req, res) => {
  const taskId = parseInt(req.params.taskid, 10);
  const { status } = req.body;

  const taskIndex = tasks.findIndex((task) => task.task_id === taskId);
  if (taskIndex === -1) {
    res.status(404).send({ message: "Task not found!" });
  } else {
    tasks[taskIndex].status = status;
    res.status(200).send({ message: "Task status updated successfully!" });
  }
});
