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


          =>LIST ROLES;
          =>LIST USERS;



