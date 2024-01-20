# AndroidMVVMxml

# Kotlin MVVM Android Sample

This project demonstrates a basic Android application using the Model-View-ViewModel (MVVM) architecture in Kotlin. It includes the implementation of a repository, ViewModel, LiveData/Flow, Retrofit for API communication, and the Navigation Component for in-app navigation.

## Features

- **MVVM Architecture**: Utilizes the Model-View-ViewModel pattern for a robust and maintainable structure.
- **LiveData/Flow**: Implements LiveData and Kotlin Flow for data handling and UI updates.
- **Retrofit**: Uses Retrofit for network operations to fetch data from an API.
- **Navigation Component**: Manages app navigation using the Jetpack Navigation Component.
- **Kotlin Coroutines**: Leverages Kotlin Coroutines for efficient asynchronous tasks.

## Getting Started

To get started with this project, clone the repository and import it into Android Studio.

git clone https://github.com/sulavtimsina/AndroidMVVMxml

### Prerequisites

- Android Studio
- Kotlin plugin
- Minimum SDK API 21

### Installation

1. **Open the project in Android Studio**: Once cloned, open the project in Android Studio.
2. **Build the Project**: Go to `Build > Make Project` to build the code.
3. **Run the App**: Use an emulator or a physical device to run the app.

## Usage

The app demonstrates a simple data fetch operation from a predefined API. The flow of the app is as follows:

1. **Fetch Data**: The ViewModel initiates data fetching via the Repository.
2. **LiveData Observation**: LiveData in the ViewModel updates the UI whenever data changes.
3. **Navigation**: Navigate through the app using the implemented Navigation Graph.

## Project Structure

- `api/`: Contains Retrofit API service definitions.
- `repository/`: Houses the Repository for data fetching operations.
- `viewmodel/`: Includes ViewModel classes for business logic.
- `ui/`: Contains UI components like Activities and Fragments.
- `navigation/`: Holds the navigation graph for app navigation.

## Contributing

Contributions are welcome. Please open an issue first to discuss what you would like to change or add.

## License

[MIT](https://choosealicense.com/licenses/mit/)

