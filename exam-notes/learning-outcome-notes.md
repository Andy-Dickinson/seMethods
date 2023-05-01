#### Devops goals:
- All revolve around speed and effectiveness 
   1. Improved deployment frequency - by breaking tasks into small chunks which can be developed quickly and deployed to release/production more often.
   2. Faster time to market - Time between an idea being concieved and delivered should be as short as possible.
   3. Lower failure rate of new releases - Reduce the number of ad-hoc fixes required by means of improved testing.
   4. Shortened lead time between fixes - The time between when a code change is made and when its deployable.
   5. Faster mean time to recovery - Improve the average time it takes to recover from service interuptions or system failure.


### Modern Software Engineering Tequniques

#### Methods
> Explain each method

* <u>Agile - Ability to adapt, deliver working software</u>
  * **Manifesto** principle 1: Satisfy customer by delivering early and continuously
  * **Manifesto** principle 2: Welcome change allowing the customer to have a competitive advantage
  * **4 Values of manifesto:**
    * **reworded AFTER value -**
    1. Individuals and Interactions over processes and tools - **Whilst tools and processes are important, having the right group of individuals and how the team communicates is even more so. Team interactions helps the team to better solve any problems that come up.** 
    2. Working software over comprehensive documentation - **Software ready to ship to the customer is more important than than detailed documentation (although that is still important). Feedback can then be obtained to improve future processes and releases.)**
    3. Customer Colaboration over contract negotiation - **Focus on contracts can lead to differences between the software detailed in the contract, the delivered software and the customers needs. It is better to collaborate with the customer and deliver continuously so as to always have a product which meets their needs.**
    4. Responding to change over following a plan - **Agile suggests a team should be able to adapt to change. Plans which never change will soon be outdated in a forever changing environment as new information is discovered.**
  * Process (per sprint) - Discover, Design, Develop, Test 
  * Method **NOT REWORDED**- 
    * Extend the iterative idea, but focus on human-centric ideas
    * Software is evolved by collaboration between developers and clients.
    * Teams are self-organising and support the multiple parts of the process
    * Teams can adapt (be agile) as requirements and challenges evolve. 
* <u>Lean - eliminate waste, manage processes, deliver value</u> - **lecture 04**
  * **7 key principles:**
    * **reworded AFTER principle (incl examples)-** 
      1. Eliminate waste - **Anything not providing value to the customer or product value** e.g.:
            * Code that goes unfinished  
            * Code that requires rewritting  
            * Task switching - Brings associated overhead when accustomising to a new or rusty task
            * Any delays (waiting for someone else to finish their work before you can continue)
            * **7 official wastes of software development:**
              1. Partially done work (not finished)
              2. Extra processes (Any steps, time or resources which do not provide value to the customer such as extra planning activities or documentation that goes unread.)
              3. Extra features (Adding features which were not requested is a waste, and adds time, effort and complexity)
              4. Task switching (When swapping between tasks, time is added when trying to understand the new task. It is better to complete tasks before moving onto another.)
              5. Waiting (Waiting for something before commencing a task. Such as unplanned downtime or long set-up times can result in a lot of wasted time and cause knock-on delays.)
              6. Motion (Similar to task-switching, but more refers to handoffs - passing your work to someone else to complete. This can result in additional time spent trying to comprehend the task as reciever will not recieve all the required knowledge.)
              7. Defects (Defects add extra time and work to fix bugs. This can lead to difficulties estimating completion time and hinder completing other work)
      2. Amplify Learning - (Relearning is a waste. To get more from learning allows for better improvement. Feedback is required to amplify learning, this can reduce or even stop alot of waste such reducing the chance of extra features being developed.)
      3. Decide as late as possible - Making decisions late allows for flexibility to change as requirments change. 
      4. Deliver as fast as possible - Delivering faster than the competition and fast enough to get a minimum viable product so feedback can be obtained from customer. This reduces wasting time on developing unused or unwanted products.
      5. Empower the team - A happy and healthy environment allows for a more productive team. People with purpose are more focused. 
      6. Build integrity in - Important for reputation by building quality in.
          * Perceived integrity - Balance of functions and reliabiliy as to how the customer inteprets them. Includes everything the customer sees and interacts with.
          * Conceptual integrity - Being consistent and ensuring the product functions reliably behind the scenes. Includes core functions and components work well together. The product should seem like it was written by one person.
      7. See the whole - The focus of optimisation should be put on the system as a whole, rather than its seperate components.
* <u>DevOps ways - combination of agile and lean, good development practices, continuous delivery, quality assurance</u>:
    1. **1st way**; The principles of flow - Maximise / accelerate the flow of work to provide more value to the customer by:
        * Make work visible - Kanban boards can show the flow of work, left to right through development stages.
        * Limit work-in progress - Reduces context switching and multi tasking allowing tasks to be completed faster.
        * Reduce batch sizes - Break work into small tasks working on one task to completion at a time allowing for faster completion time and issues sorted sooner.
        * Reduce number of handoffs - Passing your work to someone else to complete can result in additional time spent trying to comprehend the task as reciever will not recieve all the required knowledge.
        * Continually identify and elevate constraints - Reducing bottlenecks and areas which are slowing work down. 5 steps: Identify, Decide, Subordinate, Elevate, if breaks constraint: done
    2. **2nd way**; The principles of feedback - Enabling fast and continuous feedback helps find problems sooner, fix them faster and improves service to customer. Do this by:
        * Swarm and solve - Everyone on the team fixes the problem as soon as it is noticed. This allows the problem to be fixed quickly and stops the problem growing.
        * Push quality closer to source - Those closest to development should be responsible for testing and quality as they have the best knowledge of how the product functions and what problems they may be looking for.
        * Optimising for downstream work centres - Being concerned about what happens to the product at the next step improves workflow and collaboration.
    3. **3rd way**; The principles of continual learning and experimentation - Builds trust so as to test ideas and improve value and work flow. Do this by:
        * Enable organisational learning and a safety culture - Make people feel okay to learn, including by making mistakes. Leads to trust and more experimentation and learning.
        * Institutionalizing the improvement of daily work - Schedule time to fix bugs/defects and improve what the daily routine looks like continually. 
        * Transform Local Discoveries into Global Improvements - Enable sharing of knowledge within the organisation to promote continuous improvement.
        * Inject Resilience Patterns into Our Daily Work - Practice failures and challenge the team to see how systems or a team respond to learn and improve.
        * Leaders Reinforce a Learning Culture - Leaders should continually promote the benefits of learning and encourage experimentation.

#### Techniques
> Explain each technique
> How does each technique support the principles of the methods?

* Scrum - **Lecture 02**
  * Team work and Project management process
  * process:
    1. Produce the backlog by defining each task to be completed - prioritise the tasks
    2. Estimate for each task compared to the others in backlog
    3. Decide which tasks are to be completed in sprint
    4. Start work on the sprint  
    5. Meet with the team (Daily Scrum) to check the progress of the sprint
    6. Once sprint is complete, Review and reflect (can be 2 items in process list), what could have been done better, what went well? Learn lessons and adapt for next sprint.
    7. Check velocity of sprint (how much work was completed in sprint time)
    8. Plan next sprint (item 3)
   * **supports principles of Agile by:**
     * Supports Agile principle 1 by breaking work down into sprints delivering features each consecutive sprint.
     * Supports agile principle 2 by allowing for feedback from the customer which can change the design in future sprints.
   * **supports values of Agile by:**
     * Supports agile value Individuals and Interactions over processes and tools by having daily standup meetings in person when possible.
     * Supports working software over comprehensive documentation by delivering least viable product initially and then obtaining feedback from the customer to adapt.
     * Supports customer colaboration over contract negotiation by including the customer in the flow of a scrum sprint. This would allow the customer to get regular updates on the projects progress, negating the need to negotiate over contracts.
     * Supports responding to change over following a plan because for every sprint the plan can adapt if required. 
   * **supports principles of Lean by:**
     * Reduces waste by not overcommitting as tasks can be seen on the task board and discussed at each scrum meeting. Also reduces the need for context switching.
     * Amplifies learning by increased feedback from regular meetings.
     * Allows decisions to be made as late as possible as the progress of tasks can be see on the task board.
   * **supports principles of DevOps by:**
     * Supports the 1st way by making work visible on the task board. Limits work in progress by assigning every team member their own task. Continually identifies and elevates constraints as these can be discussed in daily standup meetings.
     * Sup
* Version Control - **Lecture 03**
  * Management of change
  * Tracks commits a change was made and by whom, making it easier to track and fix issues (rewind).
  * Allows for development of multiple versions at the same time by means of branching. Once complete, these can be merged together.
  * **supports principles of Agile by:**
    * 
   * **supports values of Agile by:**
     * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* Kanban - **Lecture 08**
  * Pull based system - Tasks/products are pulled through the system as required on demand.
  * Limits work in progress
  * Kanban allows responsiveness with Just-in-time manufacturing
  * Makes work visible
  * **supports principles of Agile by:**
    * 
   * **supports values of Agile by:**
     * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* User Stories - **Lecture 10**
  * They are NOT requirements (something software will do), but provide similar capability. 
  * Defines what software should do for the user / customer.
  * 3 parts: 
    1. User role (Who the story is about, detailed enough to talk about)
    2. Activity (task user wants or requires)
    3. Business Value (Why task is important)
   * Should also have a general definition of done, along with conditions of satisfaction - questions that need to be answered and conditions met to satisfy product owner.
   * Should be broken down into tasks - pieces of work that can be completed by an individual. 
  * **supports principles of Agile by:**
    * 
   * **supports values of Agile by:**
     * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* UML - **Lectures 11 & 12**
  * Unified Modelling Language - General purpose diagrams for visualising design of a system.
  * 2 **Broad categories**:
    1. Behavioural diagrams - functionality of the system, defines what happens and how objects interact. **Subcategory; Interaction diagrams** - shows flow of control and data in a system.
    2. Structural diagrams - shows relationships between components or objects in a system and models the structure and architecture of a system. 
  * **Behavioural diagrams** (see broad categories above)-
    1. Use case diagrams - 
       * **purpose**: Identifies user interactions with a system. It shows who the users are and how they use the system along with what the system does. 
       * **main features**: 
         * Actors - Someone (or something) which performs a specifc role in a system, who use or are used by the system. Represented by stick figures.
         * Use cases - The ovals, which show how the system is used.
         * Interactions - The lines, describe relationships and show how a use case or actor use the system.
    2. Activity diagrams - 
       * **purpose**: A flowchart which shows a process or systems actions and the flow between the actions.
       * **main features**:
         * Initial node - A black circle showing where to start
         * Actions - Elipses showing an action where something happens
         * Decisions - Diamonds showing choice of different paths
         * Concurrent activity - Represented by a bar, where actions occur at the same time or in any order. A second bar shows where the actions must all be completed by to continue.
         * Final node - Encircled black circle, where the process finishes.
    3. State machine diagrams - 
        * **purpose**: Shows how an objects states are transitioned.
        * **main features**:
          * Starting state
          * Other states
          * State transition (arrows)
          * End state
    4. Sequence diagrams **(Interaction Diagram)** - 
        * **purpose**: Shows object interactions in the order they occur (over time), meaning the effects can be viewed for what happens when we call a method.
        * **main features**:
          * Objects are shown at the top.
          * Each object is shown when active by a box running vertically, or inactive with dotted lines.
          * Interactions are show with labled arrows 
    5. Interaction Overview diagrams **(Interaction Diagram)** - 
        * **purpose**: An Activity diagram for when a diagram contains other (nested) activity diagrams. Allowing for a simplified, zoomed out view (overview)
    6. Timing diagrams **(Interaction Diagram)** - 
        * **purpose**: Shows the timings of interactions or processes so object state changes over time can be seen.
    7. Communication diagrams **(Interaction Diagram)** - 
        * **purpose**: Shows the flow of messages between objects and classes. Similar to use case and class diagrams but allowing for a different view to approach problem solving in another way. 
  * **Structural diagrams** (see broad categories above)- 
      1. Class Diagrams - 
         * **purpose**: Models the object classes and relationships between them. Allows visualisation of the system and how the classes relate. 
         * **main features**: 
           * Each class is shown in a box
           * Arrows of varying types show relationships between classes
           * Each class is broken down to show: name of class, attributes, and the methods.
      2. Object Diagrams - 
         * **purpose**: Shows objects at a specific point of instantiation 
      3. Component Diagrams - 
         * **purpose**: Shows relationships between components of a system. Components are a collection of classes or modules / libraries 
      4. Composite Structure Diagrams - 
         * **purpose**: Shows the relationship structure between parts of a class or classes. A low level diagram.
      5. Deployment Diagrams - 
         * **purpose**: Shows relationships between software and hardware components.
      6. Package Diagrams - 
         * **purpose**: Shows relationships and interactions between packages.
      7. Profile Diagrams - 
         * **purpose**: Extends existing UML notation
  * **supports principles of Agile by:**
    * 
   * **supports values of Agile by:**
     * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* Microservices - **Lecture 05**
  * A combination of SOA (Service Oriented Architectures), and cloud computing. Application is split up into small services which can be scaled. A gateway API calls each microservice. Allows for easier scaling and updating 
  * **supports principles of Agile by:**
    * 
   * **supports values of Agile by:**
     * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* Test Driven Development - **Lecture 14**
  * Automated tests are first written. Code is written only when a test fails, and focus is only on passing the test, not code quality. Once the test passes, code is refactored. Helps produce cleaner code, reduces fear increasing experimentation and reduces errors introduced.
  * **supports principles of Agile by:**
    * 
   * **supports values of Agile by:**
     * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* Continuous Integration and Delivery - **Lectures 15 & 16**
  * **Continuous Integration**:
    * A process whereby everyone intergrates work frequently and is tested and verified by an automated build and test process. This means errors can be identified and rectified sooner.
    * Values:
      * Risk is reduced
      * Manual repetitive tasks are reduced by automating build tasks
      * Software can be deployed at any point
      * Increased confidence in development of product
    * Process:
      * Commit changes
      * CI server recieves changes
      * CI server builds software
      * Automated tests are run
      * Build and tests either pass or fail
      * Team notified of pass or fail
  * **Continuous Delivery**:
    * Extends Continuous Integration and makes sure software can be released at any point. Releases are still manual which is different to continuous deployment which extends continuous delivery by automating releases. 
  * **supports principles of Agile by:**
    * 
   * **supports values of Agile by:**
     * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * providing feedback
* Monitoring Software - **Lecture 18**
  * Visualises important metrics and events so states can be interpreted easily.
  * Allows for knowing the state of the technology environment so problems can be detected, diagnosed and rectified earlier. Metrics can also be used to gain business value.
  * **supports principles of Agile by:**
    * 
   * **supports values of Agile by:**
     * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* Bug tracking - **Lecture 19**
  * A system which tracks software bugs which have been reported. These should also be displayed as issues on kanban board so as not to be forgotten.
  * **supports principles of Agile by:**
    * 
   * **supports values of Agile by:**
     * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 

---  

#### Core Engineering ethical principles (NOT reworded):
  * Obligation to society
  * Reporting misconduct
  * General Conduct

#### General Ethical Principles (NOT reworded)
* State a computing professional should:
  1. Contribute to society and to human well-being, acknowledging that all people are stakeholders in computing.
  2. Avoid harm.
  3. Be honest and trustworthy.
  4. Be fair and take action not to discriminate.
  5. Respect the work required to produce new ideas, inventions, creative works, and computing artifacts.
  6. Respect privacy.
  7. Honor confidentiality.

#### Professional Responsibilities are that a Computing Professional should (NOT reworded):
  1. Strive to achieve high quality in both the processes and products of professional work
  2. Maintain high standards of professional competence, conduct, and ethical practice.
  3. Know and respect existing rules pertaining to professional work.
  4. Accept and provide appropriate professional review.
  5. Give comprehensive and thorough evaluations of computer systems and their impacts, including analysis of possible risks.
  6. Perform work only in areas of competence.
  7. Foster public awareness and understanding of computing, related technologies, and their consequences.
  8. Access computing and communication resources only when authorized or when compelled by the public good.
  9. Design and implement systems that are robustly and usably secure.

#### Professional Leadership Principles state a Computing Professional should (NOT reworded):
  1. Ensure that the public good is the central concern during all professional computing work.
  2. Articulate, encourage acceptance of, and evaluate fulfillment of social responsibilities by members of the organization or group.
  3. Manage personnel and resources to enhance the quality of working life.
  4. Articulate, apply, and support policies and processes that reflect the principles of the Code.
  5. Create opportunities for members of the organization or group to grow as professionals.
  6. Use care when modifying or retiring systems.
  7. Recognize and take special care of systems that become integrated into the infrastructure of society.

#### BSC / (ISC)2
* BSC section 1:
  * 
* (ISC)2 cannon 1: