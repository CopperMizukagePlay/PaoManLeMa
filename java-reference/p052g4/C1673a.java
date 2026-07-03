package p052g4;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import p031d5.C0509i;
import p031d5.RunnableC0505e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g4.a */
/* loaded from: classes.dex */
public final class C1673a implements SensorEventListener {

    /* renamed from: a */
    public C0509i f10451a;

    /* renamed from: b */
    public Handler f10452b;

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Handler handler = this.f10452b;
        float f7 = sensorEvent.values[0];
        if (f7 <= 45.0f) {
            handler.post(new RunnableC0505e(1, this, true));
        } else if (f7 >= 450.0f) {
            handler.post(new RunnableC0505e(1, this, false));
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
