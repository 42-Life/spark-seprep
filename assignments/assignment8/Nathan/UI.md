![image](https://github.com/NathanC0926/spark-seprep/assets/147186779/e7bbb99b-8ba3-4eea-a350-ef05ab6381e5)


JSONDecodeError: Expecting value: line 1 column 1 (char 0)

Traceback:

File "/home/nc0926/.local/lib/python3.10/site-packages/streamlit/runtime/scriptrunner/script_runner.py", line 584, in _run_script
    exec(code, module.__dict__)
    
File "/mnt/c/Users/natha/whisper-self-hosted-llm/whisper-model-service/streamlit/whisper_client.py", line 19, in <module>
    response_json = response.json()
    
File "/home/nc0926/.local/lib/python3.10/site-packages/requests/models.py", line 975, in json
    raise RequestsJSONDecodeError(e.msg, e.doc, e.pos)

