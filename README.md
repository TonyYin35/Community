# Community
This is a online student discussion website, it including following features:
Tech Stack: SSM + MySQL + Redis + Kafka
● Implemented a comprehensive online forum utilizing the Spring Boot and SSM framework. The project features a robust foundation with unified state management, meticulous transaction handling, and efficient exception management.
● Implemented the login authentication system by applying a Spring Boot Interceptor to track user login status, using tokens for verification. Effectively addressed the issues associated with stateless HTTP.
● Utilized Redis as a local cache to manage features like liking and mutual following, ensuring data integrity through transaction management. We maintained data consistency by adopting a strategy of "updating the database first and then deleting the cache."
● Implemented Kafka as a message queue to deliver system alerts and leveraged the Producer-Consumer Pattern for asynchronous
processing of user actions, including likes, comments, and followers, which promoted system decoupling and load balancing.
● Implemented a multi-level cache system, utilizing Caffeine as the primary cache and Redis as the secondary cache, effectively
mitigating cache avalanches. This enhancement resulted in a remarkable 30-fold increase in server processing speed during
high-load conditions.
● Implemented full-text search functionality with Elasticsearch, enabling precise matching of search results and highlighting
keywords for an improved user experience.
● Implemented robust permission controls and URL-based access management utilizing Spring Security. Differentiated access levels
for students, faculty, and administrators within the forum.
