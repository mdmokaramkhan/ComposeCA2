# 📱 Android & Kotlin - Exam Preparation Checklist

> Complete guide for VIVA, LAB exams, and mini-projects

---

## 📚 Table of Contents
1. [VIVA Questions (Unit-wise)](#-viva-questions)
2. [Mini Projects](#-mini-projects)
3. [Lab Assignments](#-lab-assignments)
4. [Jetpack Compose Cheat Sheet](#-jetpack-compose-cheat-sheet)
5. [Final Exam Strategy](#-final-exam-strategy)

---

## 📌 MINI PROJECTS

### ☐ Unit I: Lifecycle Tracker App
**Objective:** Logs lifecycle events using Logcat

**Features:**
- [ ] Log activity lifecycle events
- [ ] Display current activity state on screen
- [ ] Show timestamp for each event

---

### ☐ Unit II: UI Playground App
**Objective:** Compare XML and Compose UI

**Features:**
- [ ] Build same screen using XML
- [ ] Build same screen using Compose
- [ ] Implement button click counter
- [ ] Update ImageView + Text dynamically

---

### ☐ Unit III: Login Form App
**Objective:** Implement form validation

**Features:**
- [ ] Email validation
- [ ] Password validation (min 6 characters)
- [ ] Show error messages
- [ ] Enable/disable login button based on validation

---

### ☐ Unit IV: Multi-Screen App
**Objective:** Navigation and data passing

**Features:**
- [ ] Home screen with input field
- [ ] Detail screen showing passed data
- [ ] Pass username between screens
- [ ] Implement back navigation

---

### ☐ Unit V: Localized Feedback App
**Objective:** Multilingual support with user feedback

**Features:**
- [ ] English + Hindi language support
- [ ] Snackbar for user actions
- [ ] Top App Bar implementation
- [ ] Bottom Navigation Bar

---

### ☐ Unit VI: Permission Manager App
**Objective:** Handle runtime permissions

**Features:**
- [ ] Request camera permission
- [ ] Request location permission
- [ ] Handle allow/deny cases
- [ ] Display permission status
- [ ] Explain rationale when needed

---

## 🧪 LAB ASSIGNMENTS

### ☐ Lab 1 – Kotlin Basics
**Tasks:**
- [ ] Practice variables and data types
- [ ] Implement loops (for, while)
- [ ] Write null safety examples
- [ ] Use safe call (`?.`) and Elvis (`?:`) operators

---

### ☐ Lab 2 – XML UI
**Tasks:**
- [ ] Create login screen using XML
- [ ] Implement LinearLayout
- [ ] Handle button click events
- [ ] Display Toast messages

---

### ☐ Lab 3 – Compose UI
**Tasks:**
- [ ] Create simple counter app
- [ ] Use Column layout
- [ ] Add Button and Text composables
- [ ] Implement click handling

---

### ☐ Lab 4 – State Management
**Tasks:**
- [ ] Build form with validation
- [ ] Use `remember` and `mutableStateOf`
- [ ] Enable/disable button based on state
- [ ] Update UI based on state changes

---

### ☐ Lab 5 – Navigation
**Tasks:**
- [ ] Setup NavController
- [ ] Create multi-screen app
- [ ] Pass arguments between screens
- [ ] Handle back navigation

---

### ☐ Lab 6 – Localization
**Tasks:**
- [ ] Add multiple language support
- [ ] Create `strings.xml` for different locales
- [ ] Use `stringResource()` in Compose
- [ ] Test language switching

---

### ☐ Lab 7 – Permissions
**Tasks:**
- [ ] Request runtime permission
- [ ] Check permission status
- [ ] Handle user response (grant/deny)
- [ ] Show rationale dialog

---

## 🎤 VIVA QUESTIONS

### 📖 UNIT I – Android & Kotlin Basics

#### ☐ 2-3 Mark Questions
- [ ] What is Android architecture?
- [ ] What are the advantages of Android?
- [ ] What is an Activity?
- [ ] Explain Activity lifecycle
- [ ] What is null safety in Kotlin?
- [ ] Safe call operator vs Elvis operator?
- [ ] Difference between `val` and `var`

#### ☐ 5 Mark Questions
- [ ] Explain Android architecture with layers
- [ ] Explain Activity lifecycle with diagram
- [ ] How Kotlin handles null pointer exceptions?

---

### 🎨 UNIT II – UI Design (XML & Compose)

#### ☐ 2-3 Mark Questions
- [ ] Difference between XML UI and Compose UI?
- [ ] What is `@Composable`?
- [ ] What are modifiers in Compose?
- [ ] Difference between Linear and Constraint Layout?
- [ ] What is Column, Row, Box?

#### ☐ 5 Mark Questions
- [ ] Explain UI layouts in Android
- [ ] Compare XML and Jetpack Compose
- [ ] Explain handling user actions in Compose

---

### 🔄 UNIT III – State & Interaction

#### ☐ 2-3 Mark Questions
- [ ] What is state in Compose?
- [ ] What does `remember` do?
- [ ] Explain `mutableStateOf`
- [ ] What is `LocalContext`?
- [ ] What is Preview in Compose?

#### ☐ 5 Mark Questions
- [ ] Explain state management in Jetpack Compose
- [ ] Design a login screen with validation logic

---

### 🧭 UNIT IV – Navigation & Data Transfer

#### ☐ 2-3 Mark Questions
- [ ] What is `NavController`?
- [ ] What is `NavHost`?
- [ ] How to pass data between screens?
- [ ] What are Intents?

#### ☐ 5 Mark Questions
- [ ] Explain Compose navigation architecture
- [ ] Explain explicit vs implicit intents

---

### 🌍 UNIT V – Localization & User Feedback

#### ☐ 2-3 Mark Questions
- [ ] What is localization?
- [ ] What is `stringResource()`?
- [ ] Difference between Toast and Snackbar?
- [ ] What is Scaffold?

#### ☐ 5 Mark Questions
- [ ] Explain multilingual support in Android
- [ ] Explain Snackbar and AppBar integration

---

### 🔐 UNIT VI – Permissions & Best Practices

#### ☐ 2-3 Mark Questions
- [ ] What are Android permissions?
- [ ] Difference between normal and dangerous permissions?
- [ ] What is runtime permission?

#### ☐ 5 Mark Questions
- [ ] Explain runtime permission handling
- [ ] List Android development best practices

---

## 🧠 JETPACK COMPOSE CHEAT SHEET

### Basic Composable
```kotlin
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name")
}
```

### State Management
```kotlin
var count by remember { mutableStateOf(0) }
```

### Button
```kotlin
Button(onClick = { count++ }) {
    Text("Click")
}
```

### Layouts
```kotlin
Column { }  // Vertical arrangement
Row { }     // Horizontal arrangement
Box { }     // Stack/Overlay
```

### TextField
```kotlin
TextField(
    value = text,
    onValueChange = { text = it },
    label = { Text("Enter text") }
)
```

### Snackbar
```kotlin
val snackbarHostState = remember { SnackbarHostState() }

Scaffold(
    snackbarHost = { SnackbarHost(snackbarHostState) }
) {
    // Content
}
```

### Navigation
```kotlin
NavHost(navController, startDestination = "home") {
    composable("home") { HomeScreen() }
    composable("detail/{id}") { backStackEntry ->
        DetailScreen(id = backStackEntry.arguments?.getString("id"))
    }
}
```

---

## ✅ FINAL EXAM STRATEGY

### Before Exam
- [ ] Review all unit VIVA questions
- [ ] Complete at least 3 mini projects
- [ ] Practice all lab assignments
- [ ] Memorize Compose cheat sheet
- [ ] Prepare diagrams (Activity lifecycle, Navigation flow)

### During Exam

#### ☐ Written Exam Tips
- [ ] Always mention lifecycle / state / navigation concepts
- [ ] Explain logic clearly before writing code
- [ ] Use proper Kotlin syntax
- [ ] Comment your code appropriately
- [ ] Test edge cases in your logic

#### ☐ VIVA Preparation
- [ ] Draw small diagrams when explaining
- [ ] Use Compose terminology confidently
- [ ] Give real-world examples
- [ ] Mention best practices
- [ ] Be ready for follow-up questions

#### ☐ Lab Exam Tips
- [ ] Read requirements carefully
- [ ] Start with basic structure first
- [ ] Test incrementally
- [ ] Handle edge cases
- [ ] Follow coding conventions

---

## 📊 Progress Tracker

### Study Progress
- [ ] Unit I - Completed
- [ ] Unit II - Completed
- [ ] Unit III - Completed
- [ ] Unit IV - Completed
- [ ] Unit V - Completed
- [ ] Unit VI - Completed

### Practical Progress
- [ ] All Mini Projects - Completed
- [ ] All Lab Assignments - Completed
- [ ] Cheat Sheet - Memorized

### Final Revision
- [ ] All VIVA questions revised
- [ ] Practice coding without IDE
- [ ] Diagrams prepared
- [ ] Mock test completed

---

## 🎯 Quick Revision Points

### Must Remember
1. **Activity Lifecycle:** onCreate → onStart → onResume → onPause → onStop → onDestroy
2. **State in Compose:** Use `remember` for simple state, `ViewModel` for complex state
3. **Navigation:** NavController + NavHost = Navigation system
4. **Null Safety:** `?.` (safe call), `?:` (Elvis), `!!` (non-null assertion)
5. **Permissions:** Normal (automatic) vs Dangerous (runtime request)

### Common Mistakes to Avoid
- ❌ Forgetting to request runtime permissions
- ❌ Not handling nullable types properly
- ❌ Mixing XML and Compose incorrectly
- ❌ Not using `remember` for state in Compose
- ❌ Hardcoding strings instead of using resources

---

## 📦 Additional Resources Needed?

### Next Steps
- [ ] 📄 One-page Viva Revision PDF
- [ ] 🎯 Most repeated university questions
- [ ] 🧠 Compose interview traps
- [ ] 📦 Full mini-project source templates

---

**Good Luck! 🚀**

> Remember: Consistent practice > Last-minute cramming
