# EmailApp

## AND102 Lab 2 - *EmailApp*

Submitted by: **Dan Sevalie-Gborie**

**EmailApp** is an Android app that displays a scrollable inbox of emails in a `RecyclerView`. Each email shows the sender, subject, a short preview, and the date it was sent, with unread emails shown in bold. A **Load More** button adds more emails to the list.

Time spent: **5** hours spent in total

## Required Features

The following **required** functionality is completed:

- [x] An `Email` data model holds each email's sender, title, and summary
- [x] `EmailFetcher` supplies the list of emails to display
- [x] Emails are displayed in a `RecyclerView` using a custom `EmailAdapter` and `ViewHolder`
- [x] Each row uses a custom layout (`email_item.xml`) showing an avatar, the **sender**, **title**, and **summary**

## Optional / Stretch Features

The following **optional** features are implemented:

- [x] Each email shows the **date** it was sent
- [x] **Unread** emails display the sender and title in **bold**
- [x] A **Load More** button fetches 5 more emails and refreshes the list

## Video Walkthrough

Here's a walkthrough of the implemented features:

<a href='https://youtube.com/shorts/G8P-736gnOM'><img src='https://img.youtube.com/vi/G8P-736gnOM/0.jpg' title='Video Walkthrough' width='300' alt='Video Walkthrough' /></a>

▶️ [Watch the walkthrough on YouTube](https://youtube.com/shorts/G8P-736gnOM)

## Tech Stack

- **Kotlin** / Android
- **RecyclerView** + `LinearLayoutManager` for the email list
- **ConstraintLayout** for the row layout
- **AndroidX AppCompat** and **Material Components**

## Setup

1. Clone this repository and open it in Android Studio.
2. Let Gradle finish syncing.
3. Build and run on an emulator or device (Android 7.0 / API 24 or newer).

## Notes

Describe any challenges encountered while building the app:

*(Example: Unread emails stayed bold after scrolling because RecyclerView reuses rows, so the adapter had to reset read emails back to normal text. Add your own here.)*

## License

    Copyright 2026 Dan Sevalie-Gborie

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
