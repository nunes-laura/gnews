CREATE TABLE IF NOT EXISTS news (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(500) NOT NULL,
    description TEXT,
    content TEXT,
    url VARCHAR(1000),
    image_url VARCHAR(1000),
    published_at TIMESTAMP,
    lang VARCHAR(10),
    category VARCHAR(50),
    source_id VARCHAR(100),
    source_name VARCHAR(200),
    source_url VARCHAR(1000),
    source_country VARCHAR(10)
);