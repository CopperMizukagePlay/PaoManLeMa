package p183y0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: y0.h */
/* loaded from: classes.dex */
public final class C3839h extends AutofillManager$AutofillCallback {

    /* renamed from: a */
    public static final C3839h f18054a = new AutofillManager$AutofillCallback();

    public final void onAutofillEvent(View view, int i7, int i8) {
        String str;
        super.onAutofillEvent(view, i7, i8);
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    str = "Unknown status event.";
                } else {
                    str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                }
            } else {
                str = "Autofill popup was hidden.";
            }
        } else {
            str = "Autofill popup was shown.";
        }
        Log.d("Autofill Status", str);
    }
}
