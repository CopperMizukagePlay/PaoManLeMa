package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import com.paoman.lema.R;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import p001a0.C0019e1;
import p001a0.C0068q2;
import p022c4.EnumC0391a;
import p022c4.EnumC0394d;
import p023c5.C0419k;
import p023c5.C0427s;
import p023c5.RunnableC0416h;
import p031d5.C0507g;
import p031d5.C0510j;
import p052g4.AbstractC1677e;
import p052g4.AbstractC1678f;
import p052g4.C1680h;
import p068i5.AbstractC2080d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public class CaptureActivity extends Activity {

    /* renamed from: e */
    public C0419k f1519e;

    /* renamed from: f */
    public DecoratedBarcodeView f1520f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018d  */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v0, types: [c4.i, java.lang.Object] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z7;
        List list;
        EnumSet enumSet;
        Bundle extras;
        C0510j c0510j;
        String stringExtra;
        int intExtra;
        int i7;
        super.onCreate(bundle);
        setContentView(R.layout.zxing_capture);
        this.f1520f = (DecoratedBarcodeView) findViewById(R.id.zxing_barcode_scanner);
        DecoratedBarcodeView decoratedBarcodeView = this.f1520f;
        C0419k c0419k = new C0419k(this, decoratedBarcodeView);
        this.f1519e = c0419k;
        Intent intent = getIntent();
        getWindow().addFlags(128);
        if (bundle != null) {
            c0419k.f1433c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                if (c0419k.f1433c == -1) {
                    int rotation = getWindowManager().getDefaultDisplay().getRotation();
                    int i8 = getResources().getConfiguration().orientation;
                    if (i8 == 2) {
                        if (rotation != 0 && rotation != 1) {
                            i7 = 8;
                            c0419k.f1433c = i7;
                        }
                        i7 = 0;
                        c0419k.f1433c = i7;
                    } else {
                        if (i8 == 1) {
                            if (rotation != 0 && rotation != 3) {
                                i7 = 9;
                            } else {
                                i7 = 1;
                            }
                            c0419k.f1433c = i7;
                        }
                        i7 = 0;
                        c0419k.f1433c = i7;
                    }
                }
                setRequestedOrientation(c0419k.f1433c);
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                Pattern pattern = AbstractC1677e.f10455a;
                String stringExtra2 = intent.getStringExtra("SCAN_FORMATS");
                EnumMap enumMap = null;
                if (stringExtra2 != null) {
                    list = Arrays.asList(AbstractC1677e.f10455a.split(stringExtra2));
                } else {
                    list = null;
                }
                String stringExtra3 = intent.getStringExtra("SCAN_MODE");
                if (list != null) {
                    enumSet = EnumSet.noneOf(EnumC0391a.class);
                    try {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            enumSet.add(EnumC0391a.valueOf((String) it.next()));
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    int i9 = AbstractC1678f.f10457a;
                    extras = intent.getExtras();
                    if (extras != null && !extras.isEmpty()) {
                        enumMap = new EnumMap(EnumC0394d.class);
                        for (EnumC0394d enumC0394d : EnumC0394d.values()) {
                            if (enumC0394d != EnumC0394d.CHARACTER_SET && enumC0394d != EnumC0394d.NEED_RESULT_POINT_CALLBACK && enumC0394d != EnumC0394d.POSSIBLE_FORMATS) {
                                String name = enumC0394d.name();
                                Class cls = enumC0394d.f1348e;
                                if (extras.containsKey(name)) {
                                    if (cls.equals(Void.class)) {
                                        enumMap.put((EnumMap) enumC0394d, (EnumC0394d) Boolean.TRUE);
                                    } else {
                                        Object obj = extras.get(name);
                                        if (cls.isInstance(obj)) {
                                            enumMap.put((EnumMap) enumC0394d, (EnumC0394d) obj);
                                        } else {
                                            Log.w("f", "Ignoring hint " + enumC0394d + " because it is not assignable from " + obj);
                                        }
                                    }
                                }
                            }
                        }
                        Log.i("f", "Hints from the Intent: " + enumMap);
                    }
                    c0510j = new C0510j();
                    if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
                        c0510j.f1832a = intExtra;
                    }
                    if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
                        decoratedBarcodeView.f1521e.setTorch(true);
                    }
                    stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
                    if (stringExtra != null) {
                        decoratedBarcodeView.setStatusText(stringExtra);
                    }
                    int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
                    String stringExtra4 = intent.getStringExtra("CHARACTER_SET");
                    new Object().m877c(enumMap);
                    decoratedBarcodeView.f1521e.setCameraSettings(c0510j);
                    BarcodeView barcodeView = decoratedBarcodeView.f1521e;
                    C0427s c0427s = new C0427s(0);
                    c0427s.f1462g = enumSet;
                    c0427s.f1463h = enumMap;
                    c0427s.f1464i = stringExtra4;
                    c0427s.f1461f = intExtra2;
                    barcodeView.setDecoderFactory(c0427s);
                }
                if (stringExtra3 != null) {
                    enumSet = (Set) AbstractC1677e.f10456b.get(stringExtra3);
                } else {
                    enumSet = null;
                }
                int i92 = AbstractC1678f.f10457a;
                extras = intent.getExtras();
                if (extras != null) {
                    enumMap = new EnumMap(EnumC0394d.class);
                    while (r13 < r12) {
                    }
                    Log.i("f", "Hints from the Intent: " + enumMap);
                }
                c0510j = new C0510j();
                if (intent.hasExtra("SCAN_CAMERA_ID")) {
                    c0510j.f1832a = intExtra;
                }
                if (intent.hasExtra("TORCH_ENABLED")) {
                    decoratedBarcodeView.f1521e.setTorch(true);
                }
                stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
                if (stringExtra != null) {
                }
                int intExtra22 = intent.getIntExtra("SCAN_TYPE", 0);
                String stringExtra42 = intent.getStringExtra("CHARACTER_SET");
                new Object().m877c(enumMap);
                decoratedBarcodeView.f1521e.setCameraSettings(c0510j);
                BarcodeView barcodeView2 = decoratedBarcodeView.f1521e;
                C0427s c0427s2 = new C0427s(0);
                c0427s2.f1462g = enumSet;
                c0427s2.f1463h = enumMap;
                c0427s2.f1464i = stringExtra42;
                c0427s2.f1461f = intExtra22;
                barcodeView2.setDecoderFactory(c0427s2);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                c0419k.f1439i.f10453e = false;
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                boolean booleanExtra = intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true);
                String stringExtra5 = intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE");
                c0419k.f1435e = booleanExtra;
                if (stringExtra5 == null) {
                    stringExtra5 = "";
                }
                c0419k.f1436f = stringExtra5;
            }
            if (intent.hasExtra("TIMEOUT")) {
                z7 = true;
                c0419k.f1440j.postDelayed(new RunnableC0416h(c0419k, 1), intent.getLongExtra("TIMEOUT", 0L));
            } else {
                z7 = true;
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                c0419k.f1434d = z7;
            }
        }
        C0419k c0419k2 = this.f1519e;
        DecoratedBarcodeView decoratedBarcodeView2 = c0419k2.f1432b;
        C0019e1 c0019e1 = c0419k2.f1442l;
        BarcodeView barcodeView3 = decoratedBarcodeView2.f1521e;
        C0068q2 c0068q2 = new C0068q2(decoratedBarcodeView2, c0019e1);
        barcodeView3.f1514E = 2;
        barcodeView3.f1515F = c0068q2;
        barcodeView3.m978h();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C0419k c0419k = this.f1519e;
        c0419k.f1437g = true;
        c0419k.f1438h.m2746a();
        c0419k.f1440j.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (!this.f1520f.onKeyDown(i7, keyEvent) && !super.onKeyDown(i7, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        C0419k c0419k = this.f1519e;
        c0419k.f1438h.m2746a();
        BarcodeView barcodeView = c0419k.f1432b.f1521e;
        C0507g cameraInstance = barcodeView.getCameraInstance();
        barcodeView.m977g();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.f1810g && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        C0419k c0419k = this.f1519e;
        c0419k.getClass();
        if (i7 == 250) {
            if (iArr.length > 0 && iArr[0] == 0) {
                c0419k.f1432b.f1521e.m897c();
                return;
            }
            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("MISSING_CAMERA_PERMISSION", true);
            c0419k.f1431a.setResult(0, intent);
            if (c0419k.f1435e) {
                c0419k.m901b(c0419k.f1436f);
            } else {
                c0419k.m900a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        C0419k c0419k = this.f1519e;
        CaptureActivity captureActivity = c0419k.f1431a;
        if (AbstractC2080d.m3395h(captureActivity, "android.permission.CAMERA") == 0) {
            c0419k.f1432b.f1521e.m897c();
        } else if (!c0419k.f1443m) {
            AbstractC2080d.m3379G(captureActivity, new String[]{"android.permission.CAMERA"}, 250);
            c0419k.f1443m = true;
        }
        C1680h c1680h = c0419k.f1438h;
        if (!c1680h.f10461c) {
            c1680h.f10459a.registerReceiver(c1680h.f10460b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            c1680h.f10461c = true;
        }
        Handler handler = c1680h.f10462d;
        handler.removeCallbacksAndMessages(null);
        if (c1680h.f10464f) {
            handler.postDelayed(c1680h.f10463e, 300000L);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f1519e.f1433c);
    }
}
