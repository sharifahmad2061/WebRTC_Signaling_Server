# WebRTC Signaling Server

This project serves as a signaling server for WebRTC communication. It facilitates the exchange of Session Description Protocol (SDP) offers, answers, and Interactive Connectivity Establishment (ICE) candidates between WebRTC clients to establish peer-to-peer communication.
It is written in Kotlin and Uses the Ktor framework. In the future I might add H2 database as well for storing some of the information.

## Features

- WebSockets for real-time communication.
- Handling of WebRTC SDP offers, answers, and ICE candidates.
- Simple and extensible structure.

## Requirements

- [Kotlin](https://kotlinlang.org/) (version 1.9.22)
- [Ktor](https://ktor.io/) (version 2.3.8)
- [WebSocket API](https://developer.mozilla.org/en-US/docs/Web/API/WebSockets) support in clients

## Getting Started

1. **Build the Project:**

    ```bash
   ./gradlew build
    ```

2. **Run the Project:**

    ```bash
   ./gradlew run
    ```
   
3. **Access the Server at:**

    - [ws://localhost:8080/](ws://localhost:8080/)

## Usage
- Connect WebRTC clients to the signaling server.
- Exchange SDP offers, answers, and ICE candidates between clients using WebSockets.
- Customize the server logic in Application.kt based on your project requirements.

## Contributing
- Feel free to contribute by opening issues, providing feedback, or submitting pull requests. Contributions are welcome!

## License
- This project is licensed under the **MIT License**.

## Acknowledgments
