-- Creation of run table
CREATE TABLE IF NOT EXISTS Run (
    run_id INT NOT NULL,
    title VARCHAR(258) NOT NULL,
    miles INT NOT NULL,
    PRIMARY KEY (run_id)
);

INSERT INTO Run(run_id, title, miles) VALUES (1, 'MONDAY MORNING RUN', 3);
INSERT INTO Run(run_id, title, miles) VALUES (2, 'Wednesday Afternoon Run', 5);
INSERT INTO Run(run_id, title, miles) VALUES (3, 'Saturday Morning Run', 8);
