.PHONY: run build clean

run:
	echo "./mvnw spring-boot:run"
	./mvnw spring-boot:run
build:
	./mvnw clean package

clean:
	./mvnw clean