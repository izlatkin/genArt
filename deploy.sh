#!/bin/bash

# Stop the previous version of the application
echo "Stopping previous version of the application..."
pkill -f "genart" || true

# Run the new version of the application
echo "Starting new version of the application..."
nohup java -jar ~/artgen/genart-0.*.jar > app.log 2>&1 &

echo "Deployment completed."