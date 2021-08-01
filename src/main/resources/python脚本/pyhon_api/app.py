from flask import Flask,render_template, url_for, request, json,jsonify
import model
app = Flask(__name__)

#设置编码
app.config['JSON_AS_ASCII'] = False

@app.route('/test')
def hello_world():

    return "hello world"

@app.route('/predict', methods=['GET', 'POST'])
def form_data():
    my_path = request.form['path']
    print(my_path)
    str = model.model_ues(my_path)
    print("http://127.0.0.1:5000/predict")
    return jsonify({'result':str,'msg':'200'})

if __name__ == '__main__':
    app.run()