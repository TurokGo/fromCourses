package com.vogella.coursera;

        import android.os.Bundle;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.fragment.app.Fragment;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;


public class BlankFragment extends Fragment {
    public static final String ARG_TEXT = "TEXT_FOR_TEXT_VIEW_KEY";
    private TextView mExampleText;

    public BlankFragment() {
        // Required empty public constructor
    }

    public static BlankFragment newInstance(String param1, String param2) {
        Bundle args = new Bundle();
        args.putString(ARG_TEXT, "GOOOOOOOOOOOOOl");
        BlankFragment fragment = new BlankFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fr_example, container, false);
        mExampleText = view.findViewById(R.id.tv_example);
        Bundle args = getArguments();
        String text = args.getString(ARG_TEXT);
        mExampleText.setText(text);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }
}