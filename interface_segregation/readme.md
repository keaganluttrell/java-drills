### Interface Segregation Problem Set

In this exercise, you are a new developer on the messaging team. Your team makes a messaging server that sends messages, and all departments use your common artifact.
 
The billing and claims teams each use it for different purposes:

- Billing uses it to send emails
- Claims uses it to send SMS messages

Billing has requested a new feature: They want you to add a new field containing a List of BccAddresses.

However, mistakes have been made in the past. Can you spot the LSP violation in the Claim's department's code?

As an astute developer, you will first refactor to correct the past LSP/ISP violations, push your new module to both teams, then obey the ISP to push the BCC feature in such a way that it does not disrupt Claims.

## Requirements

1. Refactor the code to be in compliance with the ISP 
1. Make sure all tests still pass
1. Make a commit, signifying that you have shipped a new version to Billing and Claims
1. Add the BCC feature, obeying the ISP, and without causing Claims to have to change their code due to a feature added for Billing
