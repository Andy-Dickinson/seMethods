#### Devops goals:
- All revolve around speed and effectiveness 
   1. Improved deployment frequency.
   2. Faster time to market.
   3. Lower failure rate of new releases.
   4. Shortened lead time between fixes.
   5. Faster mean time to recovery.


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
     * 
   * **supports principles of Lean by:**
     * 
   * **supports principles of DevOps by:**
     * 
* Version Control - **Lecture 03**
  * Management of change
  * Allows when a change was made and by whom, making it easier to track and fix issues (rewind).
  * Allows for development of multiple versions at the same time by means of branching. Once complete, these can be merged together.
  * **supports principles of Agile by:**
    * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* Kanban - **Lecture 08**
  * Pull based system - Tasks/products are pulled through the system as required by demand.
  * Limits work in progress
  * Kanban allows responsiveness with Just-in-time manufacturing
  * Makes work visible
  * **supports principles of Agile by:**
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
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* UML - **Lectures 11 & 12**
  * 
  * **supports principles of Agile by:**
    * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* Microservices - **Lecture 05**
  * **supports principles of Agile by:**
    * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* Test Driven Development - **Lecture 14**
  * **supports principles of Agile by:**
    * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* Continuous Integration and Delivery - **Lectures 15 & 16 (maybe 17)**
  * **supports principles of Agile by:**
    * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* Monitoring Software - **Lecture 18**
  * **supports principles of Agile by:**
    * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 
* Bug tracking - **Lecture 19**
  * **supports principles of Agile by:**
    * 
  * **supports principles of Lean by:**
    * 
  * **supports principles of DevOps by:**
    * 

---  