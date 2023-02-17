### Software Engineering Methods

* ![workflow](https://github.com/Andy-Dickinson/seMethods/actions/workflows/main.yml/badge.svg?style=flat-square)
* License [![LICENSE](https://img.shields.io/github/license/Andy-Dickinson/seMethods.svg?style=flat-square)](https://github.com/Andy-Dickinson/seMethods/blob/master/LICENSE&style=flat-square)  
* Release [![Releases](https://img.shields.io/github/release/Andy-Dickinson/seMethods/all.svg?style=flat-square)](https://github.com/Andy-Dickinson/seMethods/releases&style=flat-square)  
* Main Build Status ![GitHub Workflow Status (with branch)](https://img.shields.io/github/actions/workflow/status/Andy-Dickinson/seMethods/main.yml?branch=main&style=flat-square)  
* Develop Build Status ![GitHub Workflow Status (with branch)](https://img.shields.io/github/actions/workflow/status/Andy-Dickinson/seMethods/main.yml?branch=develop&style=flat-square)  
<br>

Notes:  
To up-date version and create a release-  
* Update in pom.xml (version) and Dockerfile (copy and entry points) 
* Rebuild and retest  
* Commit and push  
* Merge to develop  
* Merge to release  
* From release select 'new tag' using version as tag name  
* Push with 'Push tags' checked  
* On GitHub, click 'create a new release' - use pre-release if applicable  
* Merge release to master  
* Merge release to develop  
* Checkout feature branch  