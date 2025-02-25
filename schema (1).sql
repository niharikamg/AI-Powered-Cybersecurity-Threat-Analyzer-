CREATE TABLE threat_logs (
    id SERIAL PRIMARY KEY,
    sourceIP VARCHAR(255) NOT NULL,
    message TEXT NOT NULL,
    severity INT NOT NULL
);