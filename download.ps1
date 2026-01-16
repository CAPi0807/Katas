Remove-Item "target\staging" -Recurse -Force -ErrorAction SilentlyContinue
New-Item -ItemType Directory -Force -Path "target\staging\libs" | Out-Null
Copy-Item "target\*.jar" "target\staging"; Copy-Item "target\libs\*.jar" "target\staging\libs"
jpackage --input "target\staging" --name "KatasApp" --app-version "1.1" --main-jar "Katas-1.0-SNAPSHOT.jar" --main-class "software.ulpgc.katas.App" --type msi --win-dir-chooser --win-menu --dest "target\dist" --win-console