package br.gov.sp.etec.agenda.config;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by etec on 22/03/19.
 */

public class ServiceGernerator {

    //URL base. Deve sempre terminar com "/"
    //LINK-------
    public static final String API_BASE_URL = "";

    public static  <S> S createService(Class<S> serviceClass){

        //Intância do interceptador das requisições
        HttpLoggingInterceptor loggingInterceptor = new  HttpLoggingInterceptor();

        //Configura o tempo máximo de espera da requisição(15s)
        OkHttpClient.Builder httṕClient = new OkHttpClient.Builder().readTimeout(15, TimeUnit.SECONDS);

        httṕClient.addInterceptor(loggingInterceptor);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .client(httṕClient.build())
                .build();

        return retrofit.create(serviceClass);

    }//fim do createService

}//fim da classe
