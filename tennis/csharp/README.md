# Tennis Refactoring Kata in C#

Run
```
$dotnet restore
$dotnet test

# Formatting, Style and analyze code with `.editorconfig` 
# https://learn.microsoft.com/en-us/dotnet/core/tools/dotnet-format
$dotnet format
$dotnet format Tennis/Tennis.csproj -vd
$dotnet format Tennis.Tests/Tennis.Tests.csproj -vd
$dotnet format Tennis-Refactoring-Kata.sln 
```

Enable analyzer of project
```
<Project Sdk="Microsoft.NET.Sdk">

  <PropertyGroup>
    <TargetFramework>net8.0</TargetFramework>
    <IsPackable>false</IsPackable>

    <EnableNETAnalyzers>true</EnableNETAnalyzers>
    <AnalysisMode>AllEnabledByDefault</AnalysisMode>
    <TreatWarningsAsErrors>true</TreatWarningsAsErrors>
    <Nullable>enable</Nullable>
    
  </PropertyGroup>

</Project>

```


## Code Reading Practice
Here is a list of github urls of all the TennisGame C# classes:

* https://github.com/emilybache/Tennis-Refactoring-Kata/blob/main/csharp/Tennis/TennisGame1.cs
* https://github.com/emilybache/Tennis-Refactoring-Kata/blob/main/csharp/Tennis/TennisGame2.cs
* https://github.com/emilybache/Tennis-Refactoring-Kata/blob/main/csharp/Tennis/TennisGame3.cs
* https://github.com/emilybache/Tennis-Refactoring-Kata/blob/main/csharp/Tennis/TennisGame4.cs
* https://github.com/emilybache/Tennis-Refactoring-Kata/blob/main/csharp/Tennis/TennisGame5.cs
* https://github.com/emilybache/Tennis-Refactoring-Kata/blob/main/csharp/Tennis/TennisGame6.cs

