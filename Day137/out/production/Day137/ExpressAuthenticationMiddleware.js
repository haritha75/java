

const jwt = require("jsonwebtoken");

function authenticationMiddleware(req, res, next) {
  const token = req.headers.authorization;

  if (!token) {
    return res.status(401).json({ error: "Unauthorized - No token provided" });
  }

  try {
    const decoded = jwt.verify(token, "your_secret_key_here");
    req.user = decoded;
    next();
  } catch (error) {
    return res.status(401).json({ error: "Unauthorized - Invalid token" });
  }
}

module.exports = authenticationMiddleware;
