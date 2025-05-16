# Mapory – Location Diary App

**Mapory** is a mobile diary application that helps users save the places they've visited as memories enriched with photos, videos, audio recordings, and notes. These memories are displayed on an interactive map, making them easily accessible and visually engaging.  

---  

## Inspiration  
The idea for Mapory came when I was planning to show my sister around after she returned from abroad. I had visited several great places before, but I couldn’t quite remember their names or exact locations. Rather than asking friends again or trying to retrace my steps, I decided to build an app that would let me save these places as rich, map-based memories for the future. What started as a personal solution evolved into a full-featured location-based memory journal.

--- 

## Purpose

- Save memorable locations you’ve visited  
- Add rich media (photos, videos, audio, notes) to each location  
- View all your memories on an interactive map  

---

## Screenshots

### Login  
<img src="screenshots/login_1.jpg" width="300" />

### Map  
<img src="screenshots/map_1.jpg" width="300" />

### History  
<img src="screenshots/history_1.jpg" width="300" />

### Profile  
<table>
  <tr>
    <td><img src="screenshots/profile_1.jpg" width="250" /></td>
    <td><img src="screenshots/profile_2.jpg" width="250" /></td>
  </tr>
</table>

### Add Memory  
<table>
  <tr>
    <td><img src="screenshots/add_1.jpg" width="200" /></td>
    <td><img src="screenshots/add_2.jpg" width="200" /></td>
    <td><img src="screenshots/add_3.jpg" width="200" /></td>
  </tr>
</table>


## Features

- Add media: photo, video, audio, and notes  
- View all saved memories on the map  
- Search memories by name  
- Filter by category and date  
- Profile statistics:  
  - Number of memories created this week, this month, and in total  
  - Count of visits per category  

---

## Technologies Used

- **Kotlin** for Android development  
- **Firebase** (Authentication & Firestore)  
- **Google Maps SDK**  
- Third-party libraries: Glide, ExoPlayer, etc.  

---

## Login Flow

- First launch shows the Login screen  
- If the user doesn't have an account, they can register  
- After successful login, the app navigates to the map screen  
- Unless logged out, users are always taken directly to the map on launch  

---

## Add New Memory Flow

1. Select the current location or choose manually on the map  
2. Enter a memory title, description, and select a date (past or present)  
3. Add media files (photo, video, audio, notes) either live or from the device  
4. Save the memory, which will appear on the map and be stored in Firebase  

---

## Installation

### Requirements

- Android Studio (Giraffe or newer)  
- Kotlin 1.9+  
- Android SDK API Level 33+  
- Firebase project with `google-services.json` configured  

### Steps

1. git clone https://github.com/Munipp/Mapory.git  
2. Open the project in Android Studio  
3. Sync Gradle dependencies  
4. Add your google-services.json to the /app folder  
5. Run the app on an emulator or device  

