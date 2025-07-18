package com.labExp.Lab2.Question1;
import java.util.*;
public class MeetingRoom {
        String roomid;
        int capacity;
        int floorLocation;

        public MeetingRoom(String roomid, int capacity, int floorLocation) {
            this.roomid = roomid;
            this.capacity = capacity;
            this.floorLocation = floorLocation;
        }

        public String getRoomDetails() {
            return "Room Id: " + roomid + ", capacity: " + capacity + ", Floor location: " + floorLocation;
        }
    }

    //2) zoom meeting class(inherits meetingroom
    class ZoomMeetingRoom extends MeetingRoom {
        String zoomDeviceId;
        String zoomAccountId;

        public ZoomMeetingRoom(String roomid, int capacity, int floorLocation, String zoomDeviceId, String zoomAccountId) {
            super(roomid, capacity, floorLocation);
            this.zoomDeviceId = zoomDeviceId;
            this.zoomAccountId = zoomAccountId;
        }

        @Override
        public String getRoomDetails() {
            return super.getRoomDetails() + ", Zoom Device ID: " + zoomDeviceId + ",Zoom Acount ID: " + zoomAccountId;
        }
    }

    // 3) Booking Class
    class Booking {
        String employeeId, roomId, date, time;
        int duration;

        public Booking(String employeeId, String roomId, String date, String time, int duration) {
            this.employeeId = employeeId;
            this.roomId = roomId;
            this.date = date;
            this.time = time;
            this.duration = duration;
        }

        public String getDetails() {
            return "Employee: " + employeeId + ", Room: " + roomId + ",Date: " + date + "Time : " + time + ", Duration: " + duration + "mins";
        }
    }

    //Booking mamager class to manage all bookings
    class BookingManager {
        Booking[] bookings;
        int count;

        public BookingManager(int maxBookings) {
            bookings = new Booking[maxBookings];
            count = 0;
        }

        // Add a booking
        public void addBooking(Booking booking) {
            if (count < bookings.length) {
                bookings[count] = booking;
                count++;
                System.out.println("Booking added: " + booking.getDetails());
            } else {
                System.out.println("Booking limit reached! cannot add more bookings.");
            }
        }

        // show all booking for a specific date
        public void showBookingsByDate(String date) {
            System.out.println("Bookings on " + date + ":");
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (bookings[i].date.equals(date)) {
                    System.out.println(bookings[i].getDetails());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No bookings found on this date.");
            }
        }
    }

    class MeetingRoomApp {
        public static void main(String[] args) {
            // create rooms
            MeetingRoom room1 = new MeetingRoom("MR101", 10, 1);
            ZoomMeetingRoom room2 = new ZoomMeetingRoom("MR202", 20, 2, "ZD123", "ZACC456");

            BookingManager manager = new BookingManager(100);

            // add some bookings
            Booking b1 = new Booking("EMP001", "MR101", "2025-07-14", "10:00", 60);
            Booking b2 = new Booking("EMP002", "MR202", "2025-07-14", "11:00", 30);
            Booking b3 = new Booking("EMP003", "MR303", "2025-07-14", "09:00", 45);

            manager.addBooking(b1);
            manager.addBooking(b2);
            manager.addBooking(b3);

            //show bookings for a date
            manager.showBookingsByDate("2025-07-14");
        }
    }

