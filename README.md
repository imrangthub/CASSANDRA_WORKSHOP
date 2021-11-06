# CASSANDRA_WORKSHOP


          Docker:
          =================================================
          =>docker pull cassandra:3.11
          =>docker run --name cassandradb -d -p 9042:9042 cassandra:3.11



          =>cqlsh
          Runing cassandra tarminal


          =>describe keyspaces;
          check keyspaces

          =>CREATE KEYSPACE springbootcassandradb WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 1};
          Create keyspaces

          =>DROP KEYSPACE springbootcassandradb;

          =>use spring_boot_kespc;

          =>CREATE TABLE user_tbl(
             id int PRIMARY KEY,
             name text,
             address text,
             age int
          );

          =>describe tables;
          Check Table

          =>INSERT INTO user_tbl (id, name, address, age) VALUES(1001,'MD IMRAN HOSSAIN', 'Dhaka', 30);
          => select * from user_tbl;
          
          =>CREATE USER alice WITH PASSWORD 'password_a' SUPERUSER;

          =>LIST ROLES;
          =>LIST USERS;



           =>docker ps -a
           
           
          =>docker exec -it a394ae84224c bash
          
          =>docker cp e029d15afdfc:/etc/cassandra/cassandra.yaml C:/Z_MY_COMPUTER
          =>docker cp C:/Z_MY_COMPUTER/cassandra.yaml a394ae84224c:/etc/cassandra
          
          
          =>rm cassandra.yaml
          
          =>cqlsh -u cassandra -p cassandra
          
          
          
          Authentication
          ---------------------------------------------

          =>ALTER ROLE apihub WITH PASSWORD='apihub1';
          =>LIST ROLES OF apihub;

          =>CREATE USER alice WITH PASSWORD 'password_a' SUPERUSER;
          =>CREATE ROLE imran WITH PASSWORD = '123456' AND LOGIN = true AND SUPERUSER = true;

          =>LIST ALL PERMISSIONS OF apihub;
          =>LIST SELECT PERMISSIONS OF apihub;

          =>GRANT apihub TO apihub4;

          =>UPDATE system.local SET cluster_name = 'dev-bs' where key='local';
