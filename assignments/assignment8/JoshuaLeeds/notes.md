Throughout this project i ran into a few issues. First I had to remove the ,ro from the podman run as I am using a macbook and 
that is meant for a linux machine. Next I also dealt with a problem with streamlit. I had error 403 during the uploading the audio, 
So I did pip install streamlit==1.24.0 and that helped fix the issue. I also had to restart my podman machine at the beginning of this assignment
as it was not working at the start. Finally I had to make sure to isntall ffmpeg correctly as I could not convert my selected audio at the start.
