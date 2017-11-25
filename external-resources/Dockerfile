# Use an official Python runtime as a base image
FROM openjdk:8-jre

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
ADD . /app

# Make port 80 available to the world outside this container
EXPOSE 8080:8080

# Define environment variable
ENV MYSQL_HOST localhost
ENV MYSQL_USER market_data_app
ENV MYSQL_PASS market_data_app

# Run app.py when the container launches
CMD java -jar marketdata-web-client-1.0.0-SNAPSHOT.jar