package p087l2;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import p018c0.InputConnectionC0356z;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.n */
/* loaded from: classes.dex */
public class C2450n extends InputConnectionC2449m {
    @Override // p087l2.InputConnectionC2449m, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        InputConnectionC0356z inputConnectionC0356z = this.f13707b;
        if (inputConnectionC0356z != null) {
            return inputConnectionC0356z.commitContent(inputContentInfo, i7, bundle);
        }
        return false;
    }
}
