# ⏱️ FocusTimer  
![Kotlin](https://img.shields.io/badge/Kotlin-1.9-blue?logo=kotlin)
![Android](https://img.shields.io/badge/Android-12-green?logo=android)
![License](https://img.shields.io/badge/License-MIT-yellow)
![Status](https://img.shields.io/badge/Build-Stable-brightgreen)

**A minimalist and elegant Pomodoro-style focus timer for Android.**  
Stay productive with custom session lengths, ambient sounds, and a clean, dynamic UI built with Kotlin and Jetpack components.

---

## ✨ Features

- 🎯 **Customizable focus sessions** — set any duration you want  
- 🔊 **Ambient sounds** — rain, forest, ocean, coffee shop, and more  
- 🕹️ **Reset / Restart controls**  
- ⚙️ **Settings dialog** — quickly change session time without stopping  
- 📊 **Statistics screen** (track completed sessions)  
- 🚪 **One-tap “Close App”** button  
- 🌈 **Dynamic gradient background** — relaxing and modern

---

## 🖼️ Preview

<p align="center">
  <img src="https://github.com/thiagosimi10/FocusTimer/assets/preview1.png" width="260" />
  <img src="https://github.com/thiagosimi10/FocusTimer/assets/preview2.png" width="260" />
  <img src="https://github.com/thiagosimi10/FocusTimer/assets/preview3.png" width="260" />
</p>

> *Screenshots of the current UI — clean, minimal and focused.*

---

## 🧱 Tech Stack

| Layer | Technology |
|-------|-------------|
| Language | **Kotlin** |
| Architecture | **MVVM (ViewModel + LiveData)** |
| UI | **ViewBinding + ConstraintLayout** |
| UI Theme | **Material Components 3 + Dynamic Gradients** |
| Audio | **MediaPlayer / SoundPool** |
| Build System | **Gradle (AGP 8.x)** |

---

## 🚀 Getting Started

### 1. Clone the repository


  git clone https://github.com/thiagosimi10/FocusTimer.git

cd FocusTimer
2. Open the project

Open it in Android Studio (Giraffe or newer)
Wait for Gradle sync to complete.

3. Run the app

Select a device or emulator

Press ▶️ Run or use:

./gradlew installDebug

📂 Project Structure
FocusTimer/
 ├── app/src/main/java/com/example/focustimer/
 │   ├── presentation/
 │   │   ├── splash/          # Splash screen with animation
 │   │   ├── main/            # Main timer UI
 │   │   ├── statistics/      # Session history
 │   │   └── viewmodel/       # Timer logic (MVVM)
 │   └── domain/
 │       └── model/ & usecase/
 ├── res/
 │   ├── layout/              # XML UI files
 │   ├── drawable/            # Gradients, shapes
 │   ├── values/              # Strings, colors, styles
 │   └── raw/                 # Sound files (beeps, ambience)
 ├── build.gradle
 └── AndroidManifest.xml

🧠 How It Works

The ViewModel controls timer logic (TimerViewModel.kt)

LiveData updates the UI every second

When time runs out, a beep sound plays automatically

Users can set a custom duration at runtime

The UI animates background gradients dynamically for a calm experience

🎨 Design Philosophy

“Simplicity is the ultimate sophistication.” — Leonardo da Vinci

FocusTimer is built around the idea that minimalism boosts focus.
Colors, typography, and transitions are intentionally calm — creating a distraction-free zone to help you do deep work.

🧩 Future Improvements

🧘 Add breathing animations between sessions

🌗 Light/Dark mode support

📈 Session tracking with history chart

🔔 Smart reminders

🧑‍💻 Author

Thiago Simionato
Senior Software Engineer · Creator of FocusTimer
📍 Brazil 🇧🇷
🔗 GitHub
 • LinkedIn
