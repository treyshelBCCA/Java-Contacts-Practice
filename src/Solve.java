//    while (true) {
//        System.out.println("What is your new contact name (press 'q' to stop adding contact)?");
//        String userInput = scanner.nextLine();
//        if (!userInput.equalsIgnoreCase("q")) {
//            contacts.add(userInput);
//        } else {
//            break;
//        }
//    }
//
//        while (true) {
//        System.out.println("[V]iew contacts or [D]elete contact or [Q] quit?");
//        String viewOrDeleteInput = scanner.nextLine();
//        if (viewOrDeleteInput.equalsIgnoreCase("V")) {
//            for (String contact : contacts) {
//                System.out.println(contact);
//            }
//        } else if (viewOrDeleteInput.equalsIgnoreCase("D")) {
//            System.out.println("Name of contact to remove: ");
//            String contactToRemove = scanner.nextLine();
//            contacts.remove(contactToRemove);
//            if (contacts.size() == 0) {
//                System.out.println("All contacts removed!");
//                break;
//            }
//        } else if (viewOrDeleteInput.equalsIgnoreCase("Q")){
//            break;
//        }
//    }
//
