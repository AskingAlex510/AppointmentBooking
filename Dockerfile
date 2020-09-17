#FROM openjdk:8
#WORKDIR /root/AppointmentBooking
#COPY AppointmentBooking.iml /Root/AppointmentBooking
#RUN javac AppointmentBooking.iml
#ENTRYPOINT java AppointmentBooking

FROM maven:3.5-jdk-8