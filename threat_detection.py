import pandas as pd
from sklearn.ensemble import IsolationForest
import joblib

# Dummy dataset
data = {
    'sourceIP': ['192.168.1.1', '10.0.0.1', '192.168.1.2', '172.16.0.1', '192.168.1.3'],
    'severity': [2, 9, 5, 8, 3]
}

df = pd.DataFrame(data)

# Train model
model = IsolationForest(contamination=0.2)
df['anomaly'] = model.fit_predict(df[['severity']])

# Save model
joblib.dump(model, "threat_model.pkl")
