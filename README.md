---
page_type: sample
languages:
- java
products:
- Azure
- Azure App configuration
description: "This project demonstrates how to connect and use app config from a spring aop application"
urlFragment: "https://github.com/Azure-Samples/azure-springaop-appconfig.git"
---

# Official Microsoft Sample

<!-- 
Guidelines on README format: https://review.docs.microsoft.com/help/onboard/admin/samples/concepts/readme-template?branch=master

Guidance on onboarding samples to docs.microsoft.com/samples: https://review.docs.microsoft.com/help/onboard/admin/samples/process/onboarding?branch=master

Taxonomies for products and languages: https://review.docs.microsoft.com/new-hope/information-architecture/metadata/taxonomies?branch=master
-->

Give a short description for your sample here. What does it do and why is it important?

## Contents

Outline the file contents of the repository. It helps users navigate the codebase, build configuration and any related assets.

| File/folder       | Description                                |
|-------------------|--------------------------------------------|
| `src`             | Sample source code.                        |
| `.gitignore`      | Define what to ignore at commit time.      |
| `CHANGELOG.md`    | List of changes to the sample.             |
| `CONTRIBUTING.md` | Guidelines for contributing to the sample. |
| `README.md`       | This README file.                          |
| `LICENSE`         | The license for the sample.                |

## Prerequisites

Outline the required components and tools that a user might need to have on their machine in order to run the sample. This can be anything from frameworks, SDKs, OS versions or IDE releases.


## How to run this sample

Working installation of Java and Maven
An Internet connection

Step 1: Download Java (8 and above) for your platform
To successfully use this sample, you need a working installation of Java and Maven.

Step 2: Clone or download this repository  
From your shell or command line:  

git clone https://github.com/Azure-Samples/azure-springaop-appconfig.git     
cd azure-springaop-appconfig   

Step 3:   
To create a new App Configuration store, sign in to the [Azure Portal](https://ms.portal.azure.com "Azure Portal")
. In the upper-left corner of the pane, select +Create a resource  
Select App Configuration from the search results, and then select Create.    
On the App Configuration > Create pane -> Enter Resource Name, Resource Group, Subscription, Location    
Once the App Config is created - Goto Access Keys and note ConnectionString - this will be needed later  
Select Create. The deployment might take a few minutes to finish.  
After the deployment is finished, select Settings > Access Keys.  
Make a note of either the primary read-only or primary read-write key connection string.    
You'll use this connection string later to configure your application to communicate with the App Configuration store that you created.    

Step 4: 
Goto TestAOP file   
Update the connectionString that was noted earlier  
mvn clean package  
Run TestAOP    
This prints the value of the key set as in this case "keyString"   

## Key concepts

https://docs.microsoft.com/en-us/azure/azure-app-configuration/overview

What is Azure App Config?  
Azure App Configuration provides a service to centrally manage application settings and feature flags. Modern programs, especially programs running in a cloud, generally have many components that are distributed in nature  

App Configuration complements Azure Key Vault, which is used to store application secrets.


## Contributing

This project welcomes contributions and suggestions.  Most contributions require you to agree to a
Contributor License Agreement (CLA) declaring that you have the right to, and actually do, grant us
the rights to use your contribution. For details, visit https://cla.opensource.microsoft.com.

When you submit a pull request, a CLA bot will automatically determine whether you need to provide
a CLA and decorate the PR appropriately (e.g., status check, comment). Simply follow the instructions
provided by the bot. You will only need to do this once across all repos using our CLA.

This project has adopted the [Microsoft Open Source Code of Conduct](https://opensource.microsoft.com/codeofconduct/).
For more information see the [Code of Conduct FAQ](https://opensource.microsoft.com/codeofconduct/faq/) or
contact [opencode@microsoft.com](mailto:opencode@microsoft.com) with any additional questions or comments.
